import java.sql.Time;

public class booking {
	private String spaceId;
	private String bookingId;
	private userAccount user;
	private Time bookingTime;
	private Time expiryTime;
	private String plateNum;
	private boolean status = false;
	
	public booking(userAccount user, Time bookingTime, Time expiryTime, String plateNum, String spaceId) {
		this.user = user;
		this.bookingTime = bookingTime;
		this.expiryTime = expiryTime;
		this.plateNum = plateNum;
		this.spaceId = spaceId;
		this.bookingId = "12345";
		
	}
	
	public void changeStatus() {
		this.status = true;
	}
	
	public String getPlateNum() {
		return this.plateNum;
	}
	
	public userAccount getUser() {
		return this.user;
	}
	
	public String getspaceId() {
		return this.spaceId;
	}
	
	public String getBookingId() {
		return this.bookingId;
	}
	
	public Time getBookingTime() {
		return this.bookingTime;
	}
	
	public Time getExpiryTime() {
		return this.expiryTime;
	}
}
