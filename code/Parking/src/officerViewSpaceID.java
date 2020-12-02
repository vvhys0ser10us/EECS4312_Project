import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class officerViewSpaceID {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					officerViewSpaceID window = new officerViewSpaceID();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public void run() {
		try {
			officerViewSpaceID window = new officerViewSpaceID();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public officerViewSpaceID() {
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
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(109, 78, 86, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(welcome.currentUser.getName());
		lblNewLabel_1.setBounds(244, 78, 152, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("From");
		lblNewLabel_4.setBounds(109, 106, 61, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(welcome.currentBooking.getBookingTime().toString());
		lblNewLabel_5.setBounds(244, 106, 206, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("To");
		lblNewLabel_6.setBounds(109, 134, 61, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(welcome.currentBooking.getExpiryTime().toString());
		lblNewLabel_7.setBounds(244, 134, 206, 16);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Payment Status");
		lblNewLabel_8.setBounds(109, 190, 105, 16);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(welcome.currentBooking.getStatusForViewBooking());
		lblNewLabel_9.setBounds(244, 190, 152, 16);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Space ID");
		lblNewLabel_10.setBounds(109, 51, 61, 16);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel(welcome.currentBooking.getspaceId());
		lblNewLabel_11.setBounds(244, 50, 137, 16);
		frame.getContentPane().add(lblNewLabel_11);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				officerviewBooking a = new officerviewBooking();
				a.run();
				frame.dispose();
			}
		});
		btnBack.setBounds(6, 6, 117, 29);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("Plate Number");
		lblNewLabel_2.setBounds(109, 162, 86, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(welcome.currentBooking.getPlateNum());
		lblNewLabel_3.setBounds(244, 162, 170, 16);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
