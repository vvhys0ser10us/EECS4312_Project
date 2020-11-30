import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class userWindow {
	
	private JFrame frame;
	private JPanel panel;
	private JButton bookButton;
	private JButton cancelButton;
	private JButton payButton;
	private JButton viewButton;
	private JButton btnLogout;
	
	public userWindow() {
		frame = new JFrame();
		frame.setTitle("User Services");
		frame.setBounds(900, 500, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setVisible(true);
		
		bookButton = new JButton("BOOK SPACE");
		cancelButton = new JButton("CANCELLATIONS");
		payButton = new JButton("PAY");
		viewButton = new JButton("VIEW BOOKINGS");
		bookButton.setBounds(120, 60, 200, 29);
		frame.getContentPane().add(bookButton);
		
		cancelButton.setBounds(120, 120, 200, 29);
		frame.getContentPane().add(cancelButton);
		
		payButton.setBounds(120, 180, 200, 29);
		frame.getContentPane().add(payButton);
		
		viewButton.setBounds(120, 240, 200, 29);
		frame.getContentPane().add(viewButton);
		
		btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcome a = new welcome();
				frame.dispose();
				a.run();
			}
		});
		btnLogout.setBounds(6, 6, 117, 29);
		frame.getContentPane().add(btnLogout);
		
		bookButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//leading to a separate
				//window, where once clicked, the customer is prompted to enter the parking space number, booking
				//time, and their license plate number.
				bookSpace bs = new bookSpace();
				frame.dispose();

			}
		});
		
		payButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//leading to a separate window, where
				//once clicked, the customer is prompted to enter the parking space number they wish to pay for.
				payment pay = new payment();
				frame.dispose();
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Test
				cancellation cl = new cancellation();
				frame.dispose();
			}
		});
		
		viewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//leading to
				//a separate window displaying all their bookings.
				viewbookings vb = new viewbookings();
				frame.dispose();
			}
		});
		
	}
		
}
