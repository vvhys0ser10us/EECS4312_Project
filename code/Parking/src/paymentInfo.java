import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class paymentInfo {
	
	private JFrame frame;
	public JTextField cardNo;
	public JTextField fname;
	public JTextField lname;
	public JTextField cvv;
	public JTextField expiration;
	
	public paymentInfo() {
		
		frame = new JFrame();
		frame.setTitle("PAYMENT");
		frame.setBounds(900, 500, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setVisible(true);
		
		JLabel cardLabel = new JLabel("Card Number");
		cardLabel.setBounds(63, 55, 200, 16);
		frame.getContentPane().add(cardLabel);
		cardNo = new JTextField();
		cardNo.setBounds(255, 55, 130, 26);
		frame.getContentPane().add(cardNo);
		cardNo.setColumns(10);
		
		
		JLabel eLabel = new JLabel("Expiration");
		eLabel.setBounds(63, 105, 200, 16);
		frame.getContentPane().add(eLabel);
		expiration = new JTextField();
		expiration.setBounds(255, 105, 130, 26);
		frame.getContentPane().add(expiration);
		expiration.setColumns(10);
		
		
		JLabel cvvLabel = new JLabel("CVV");
		cvvLabel.setBounds(63, 155, 200, 16);
		frame.getContentPane().add(cvvLabel);
		cvv = new JTextField();
		cvv.setBounds(255, 155, 130, 26);
		frame.getContentPane().add(cvv);
		cvv.setColumns(10);
		
		
		JLabel fnameLabel = new JLabel("First Name");
		fnameLabel.setBounds(63, 205, 200, 16);
		frame.getContentPane().add(fnameLabel);
		fname = new JTextField();
		fname.setBounds(255, 205, 130, 26);
		frame.getContentPane().add(fname);
		fname.setColumns(10);
		
		
		JLabel lnameLabel = new JLabel("Last Name" );
		lnameLabel.setBounds(63, 255, 200, 16);
		frame.getContentPane().add(lnameLabel);
		lname = new JTextField();
		lname.setBounds(255, 255, 130, 26);
		frame.getContentPane().add(lname);
		lname.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstname = welcome.currentUser.getFirstName();
				String lastname = welcome.currentUser.getLastName();
				if(cardNo.getText().isEmpty() || expiration.getText().isEmpty() || cvv.getText().isEmpty() || fname.getText().isEmpty() || lname.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Do Not Leave Blank!");
				}else if(firstname.equals(fname.getText()) && lastname.equals(lname.getText()) ) {
					frame.dispose();
					new paid();
					welcome.currentBooking.setcustomerPaidstatus();
				}else {
					JOptionPane.showMessageDialog(null, "Information Not Match!");
				}
			}
		});
		btnConfirm.setBounds(70, 372, 117, 29);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				paymentPage p = new paymentPage();
			}
		});
		btnBack.setBounds(270, 372, 117, 29);
		frame.getContentPane().add(btnBack);
	}
	
	public static void main(String[] args) {
		new paymentInfo();
	}
}
