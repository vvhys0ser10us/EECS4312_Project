import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class cancellation {
//This feature allows a customer to cancel a parking space which they previously booked, bookings
//can only be canceled before they expire.
	
	private JFrame frame;
	private JTextField bookId;
	
	public cancellation() {
	
		frame = new JFrame();
		frame.setTitle("CANCELLATION");
		frame.setBounds(900, 500, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOKING ID");
		lblNewLabel.setBounds(63, 105, 200, 16);
		frame.getContentPane().add(lblNewLabel);
		
		bookId = new JTextField();
		bookId.setBounds(255, 100, 130, 26);
		frame.getContentPane().add(bookId);
		bookId.setColumns(10);
		

		frame.setVisible(true);
		
		JButton btnConfirm = new JButton("confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//

			}
		});
		btnConfirm.setBounds(70, 372, 117, 29);
		frame.getContentPane().add(btnConfirm);
		
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
	

}
