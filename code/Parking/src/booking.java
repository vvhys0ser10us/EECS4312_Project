import java.time.LocalDateTime;
import java.util.Random;

public class booking {
	private String spaceId;
	private String bookingId;
	private userAccount user;
	private LocalDateTime bookingTime;
	private LocalDateTime expiryTime;
	private String plateNum;
	private boolean paid = false;
	private boolean cancelled = false;
	private boolean completed = false;
	
	
	public booking(userAccount user, LocalDateTime bookingTime, LocalDateTime expiryTime, String plateNum, String spaceId) {
		this.user = user;
		this.bookingTime = bookingTime;
		this.expiryTime = expiryTime;
		this.plateNum = plateNum;
		this.spaceId = spaceId;
		this.bookingId = getString();
		
	}
	
	
	public String getString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 8) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
	
	public boolean getPaidStatus() {
		return paid;
	}
	
	public boolean getCancelledStatus() {
		return cancelled;
	}
	
	public boolean getCompletedStatus() {
		return completed;
	}
	
	public void paidStatus() {
		this.paid = true;
	}
	
	public void cancelStatus() {
		this.cancelled = true;
	}
	
	public void completedStatus() {
		this.completed = true;
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
