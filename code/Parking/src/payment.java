import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		
		fname = new JTextField();
		fname.setBounds(255, 100, 130, 26);
		frame.getContentPane().add(fname);
		fname.setColumns(10);
		
		JLabel paymentLabel = new JLabel("Total Payment: " + needtopay);
		paymentLabel.setBounds(163, 275, 200, 16);
		frame.getContentPane().add(paymentLabel);
		
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
	
	public static void main(String[] args) {
		new payment();
	}
}
