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
	
	public userWindow() {
		frame = new JFrame();
	 	panel = new JPanel();
		
		bookButton = new JButton("BOOK SPACE");
		cancelButton = new JButton("CANCELLATIONS");
		payButton = new JButton("PAY");
		viewButton = new JButton("VIEW BOOKINGS");
		
		panel.setBorder(BorderFactory.createEmptyBorder(200,200,100,200));
		panel.setLayout(new GridLayout(0,1));
		panel.add(bookButton);
		panel.add(payButton);
		panel.add(cancelButton);
		panel.add(viewButton);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("User Services");
		frame.pack();
		frame.setVisible(true);
		
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
				System.out.println("pay");
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
				System.out.println("view");
			}
		});
		
	}
	



		
}
