import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
		frame.setBounds(900, 500, 450, 300);
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
		


		
		email = new JTextField();
		email.setBounds(160, 87, 130, 26);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("email");
		lblNewLabel.setBounds(87, 92, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (email.getText().isEmpty() || !welcome.userList.contains(email.getText()))
					JOptionPane.showMessageDialog(null, "Check input ");
				else {
					officerViewSpaceID a = new officerViewSpaceID(email.getText());
					a.run();
					frame.dispose();
				}

			}
		});
		btnNewButton.setBounds(160, 150, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
