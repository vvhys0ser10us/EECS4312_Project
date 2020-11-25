import java.time.LocalDateTime;

public class booking {
	private String spaceId;
	private String bookingId;
	private userAccount user;
	private LocalDateTime bookingTime;
	private LocalDateTime expiryTime;
	private String plateNum;
	private boolean status = false;
	
	public booking(userAccount user, LocalDateTime bookingTime, LocalDateTime expiryTime, String plateNum, String spaceId) {
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
	
	public LocalDateTime getBookingTime() {
		return this.bookingTime;
	}
	
	public LocalDateTime getExpiryTime() {
		return this.expiryTime;
	}
}
