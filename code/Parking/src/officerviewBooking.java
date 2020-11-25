import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class officerviewBooking {

	private JFrame frame;
	private JTextField textField;

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
		frame.setBounds(100, 100, 450, 300);
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
		btnBooked.setBounds(132, 125, 182, 29);
		frame.getContentPane().add(btnBooked);
		
		JButton btnpayment = new JButton("Check Payment status");
		btnpayment.setBounds(132, 188, 182, 29);
		frame.getContentPane().add(btnpayment);
		
		JButton btnExpiryDate = new JButton("Check Expirey Date");
		btnExpiryDate.setBounds(132, 158, 182, 29);
		frame.getContentPane().add(btnExpiryDate);
		
		textField = new JTextField();
		textField.setBounds(160, 87, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("email");
		lblNewLabel.setBounds(87, 92, 61, 16);
		frame.getContentPane().add(lblNewLabel);
	}

}
