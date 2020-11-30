import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class officerviewBooking {

	private JFrame frame;
	private JTextField email;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					officerviewBooking window = new officerviewBooking();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	public void run() {
		try {
			officerviewBooking window = new officerviewBooking();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public officerviewBooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(900, 500, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				officerIn a = new officerIn();
				a.run();
			}
		});
		btnBack.setBounds(6, 6, 117, 29);
		frame.getContentPane().add(btnBack);
		
		JButton btnBooked = new JButton("Check booked space");
		btnBooked.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBooked.setBounds(132, 154, 182, 29);
		frame.getContentPane().add(btnBooked);
		
		JButton btnpayment = new JButton("Check Payment status");
		btnpayment.setBounds(132, 310, 182, 29);
		frame.getContentPane().add(btnpayment);
		
		JButton btnExpiryDate = new JButton("Check Expirey Date");
		btnExpiryDate.setBounds(132, 230, 182, 29);
		frame.getContentPane().add(btnExpiryDate);
		
		email = new JTextField();
		email.setBounds(160, 87, 130, 26);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("email");
		lblNewLabel.setBounds(87, 92, 61, 16);
		frame.getContentPane().add(lblNewLabel);
	}

}
