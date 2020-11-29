import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class managePayment {/////////////////
	private JFrame frame;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField email;
	private JTextField password;
	
	public void run() {
		try {
			managePayment window = new managePayment();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public managePayment() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(900, 500, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer First Name");
		lblNewLabel.setBounds(63, 50, 150, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Last Name");
		lblNewLabel_1.setBounds(63, 107, 150, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Customer Email");
		lblNewLabel_2.setBounds(63, 167, 150, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Parking Space Number");
		lblNewLabel_3.setBounds(63, 225, 150, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		firstname = new JTextField();
		firstname.setBounds(255, 45, 130, 26);
		frame.getContentPane().add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setBounds(255, 100, 130, 26);
		frame.getContentPane().add(lastname);
		lastname.setColumns(10);
		
		email = new JTextField();
		email.setBounds(255, 157, 130, 26);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		password = new JTextField();
		password.setBounds(255, 222, 130, 26);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		
		JButton paid = new JButton("Paid");
		paid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "The status has been updated to: Paid ");

			}
		});
		paid.setBounds(63, 275, 117, 29);
		frame.getContentPane().add(paid);
		
		JButton unpaid = new JButton("Unpaid");
		unpaid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "The status has been updated to: Unpaid ");

			}
		});
		unpaid.setBounds(250, 275, 117, 29);
		frame.getContentPane().add(unpaid);
		
	}
	
	
}
