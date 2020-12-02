import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class payment {
//This feature allows the customer to pay for their currently booked parking space.
	
	private JFrame frame;
	public JTextField bookId;
	public int needtopay = 0;
	public JTextField fname;
	public JTextField lname;
	
	public payment() {
		frame = new JFrame();
		frame.setTitle("PAYMENT");
		frame.setBounds(900, 500, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("BOOKING ID");
		lblNewLabel.setBounds(63, 105, 200, 16);
		frame.getContentPane().add(lblNewLabel);
		
		bookId = new JTextField();
		bookId.setBounds(255, 100, 130, 26);
		frame.getContentPane().add(bookId);
		bookId.setColumns(10);
		
		JLabel fnameLabel = new JLabel("FirstName");
		fnameLabel.setBounds(63, 155, 200, 16);
		frame.getContentPane().add(fnameLabel);
		
		JLabel lnameLabel = new JLabel("LastName" );
		lnameLabel.setBounds(63, 205, 200, 16);
		frame.getContentPane().add(lnameLabel);
		
		fname = new JTextField();
		fname.setBounds(255, 155, 130, 26);
		frame.getContentPane().add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setBounds(255, 205, 130, 26);
		frame.getContentPane().add(lname);
		lname.setColumns(10);
		
		JLabel paymentLabel = new JLabel("Total Payment: " + needtopay);
		paymentLabel.setBounds(180, 300, 200, 16);
		frame.getContentPane().add(paymentLabel);
	
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean found = false;
				boolean paid = false;
				boolean cancelled = false;
				boolean completed = false;
				String id = bookId.getText();
				for(int i = 0; i < welcome.bookinglist.size(); i++) {
					if(welcome.bookinglist.get(i).getBookingId().equals(id)) {
						found = true;
						if(welcome.bookinglist.get(i).getCancelledStatus() == true) {
							cancelled = true;
						}else if (welcome.bookinglist.get(i).getCompletedStatus() == true) {
							completed = true;
						}else if(welcome.bookinglist.get(i).getCancelledStatus() == false && welcome.bookinglist.get(i).getCompletedStatus() == false &&
								welcome.bookinglist.get(i).getPaidStatus() == true) {
							paid = true;
						}else if(welcome.bookinglist.get(i).getCancelledStatus() == false && welcome.bookinglist.get(i).getCompletedStatus() == false &&
								welcome.bookinglist.get(i).getPaidStatus() == false) {
								welcome.setBooking(welcome.bookinglist.get(i));
						}
					}else {
						found = false;
					}
				}
				
				if(found == false) {
					JOptionPane.showMessageDialog(null, "Booking Does Not Exist!");
				}else if(completed == true) {
					JOptionPane.showMessageDialog(null, "Booking Already Completed!");
				}else if(cancelled == true) {
					JOptionPane.showMessageDialog(null, "Booking Already Cancelled!");
				}else if(paid == true && completed == false && cancelled == false) {
					JOptionPane.showMessageDialog(null, "Booking Already Paid!");
				}else if(found == true && cancelled == false && completed == false) {
					frame.dispose();
					paymentPage a = new paymentPage();
				}
			}
		});
		btnConfirm.setBounds(70, 372, 117, 29);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calculate payment here.
				needtopay = 0;
				boolean found = false;
				boolean paid = false;
				boolean cancelled = false;
				boolean completed = false;
				String id = bookId.getText();
				for(int i = 0; i < welcome.bookinglist.size(); i++) {
					if(welcome.bookinglist.get(i).getBookingId().equals(id)) {
						found = true;
						if(welcome.bookinglist.get(i).getCancelledStatus() == true) {
							cancelled = true;
						}else if (welcome.bookinglist.get(i).getCompletedStatus() == true) {
							completed = true;
						}else if(welcome.bookinglist.get(i).getCancelledStatus() == false && welcome.bookinglist.get(i).getCompletedStatus() == false &&
								welcome.bookinglist.get(i).getPaidStatus() == true) {
							paid = true;
						}else if(welcome.bookinglist.get(i).getCancelledStatus() == false && welcome.bookinglist.get(i).getCompletedStatus() == false &&
								welcome.bookinglist.get(i).getPaidStatus() == false) {
							
							LocalDateTime from = welcome.bookinglist.get(i).getBookingTime();
							LocalDateTime to = welcome.bookinglist.get(i).getExpiryTime();
							Duration du = Duration.between(from, to);
							System.out.println(du.toHours() + " hours");
							needtopay = (int) (du.toHours() * 10);
						}
					}else {
						found = false;
					}
				}
				
				if(found == false) {
					JOptionPane.showMessageDialog(null, "Booking Does Not Exist!");
				}else if(completed == true) {
					JOptionPane.showMessageDialog(null, "Booking Already Completed!");
				}else if(cancelled == true) {
					JOptionPane.showMessageDialog(null, "Booking Already Cancelled!");
				}else if(paid == true && completed == false && cancelled == false) {
					JOptionPane.showMessageDialog(null, "Booking Already Paid!");
				}else if(found == true && cancelled == false && completed == false) {
					
				}
				
				paymentLabel.setText("Total Payment: " + needtopay);
			}
		});
		btnEnter.setBounds(170, 250, 117, 29);
		frame.getContentPane().add(btnEnter);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				userWindow a = new userWindow();
			}
		});
		btnBack.setBounds(270, 372, 117, 29);
		frame.getContentPane().add(btnBack);
	}
	
	public static void main(String[] args) {
		new payment();
	}
	
}
