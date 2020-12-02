import java.time.LocalDateTime;
import java.util.Random;

public class booking {
	private Space space;
	private String bookingId;
	private userAccount user;
	private LocalDateTime bookingTime;
	private LocalDateTime expiryTime;
	private String plateNum;
	private boolean paid = false;
	private boolean cancelled = false;
	private boolean completed = false;
	
	
	public booking(userAccount user, LocalDateTime bookingTime, LocalDateTime expiryTime, String plateNum, Space space) {
		this.user = user;
		//should booking time whever booking happens?
		this.bookingTime = bookingTime;
		this.expiryTime = expiryTime;
		this.plateNum = plateNum;
		this.space = space;
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
		return this.space.getId();
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
	
	public Space getSpace() {
		return this.space;
	}
	
	
	//get status for viewbooking
	public String getStatusForViewBooking() {
		String status = "";
		if(this.cancelled == true) {
			status = "Cancelled";
		}else if(this.completed == true) {
			status = "Completed";
		}else if(paid == true) {
			status = "Paid";
		}else if(paid == false) {
			status = "Unpaid";
		}
		return status;
	}
}
