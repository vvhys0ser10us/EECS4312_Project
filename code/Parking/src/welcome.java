import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class welcome {

	private JFrame frame;
	public static ArrayList<userAccount> db = new ArrayList<>();
	public static ArrayList<officerAccount> officer = new ArrayList<>();
	public static ArrayList<String> officerlist = new ArrayList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome window = new welcome();
					window.frame.setVisible(true);
					welcome.officerlist.add("1111");
					
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JButton btnOfficer = new JButton("I am an Officer");
		btnOfficer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				officerLogin a = new officerLogin();
				frame.dispose();
				a.run();
			}
		});
		btnOfficer.setBounds(269, 17, 117, 29);
		frame.getContentPane().add(btnOfficer);
	}
}
