import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class welcome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome window = new welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void run() {
		try {
			welcome window = new welcome();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * Create the application.
	 */
	public welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(900, 500, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btncustomer = new JButton("Sign In");
		btncustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login a = new login();
				frame.dispose();
				a.run();
				
			}
		});
		btncustomer.setBounds(45, 179, 117, 29);
		frame.getContentPane().add(btncustomer);
		
		JButton btnNewCustomer = new JButton("New Customer");
		btnNewCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterForm a = new RegisterForm();
				frame.dispose();
				a.run();
			}
		});
		btnNewCustomer.setBounds(269, 179, 117, 29);
		frame.getContentPane().add(btnNewCustomer);
	}
}
