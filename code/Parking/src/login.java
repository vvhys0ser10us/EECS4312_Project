import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField uname;
	private JTextField psd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel username = new JLabel("Username");
		username.setBounds(49, 81, 100, 16);
		frame.getContentPane().add(username);
		
		JLabel password = new JLabel("Password");
		password.setBounds(49, 142, 61, 16);
		frame.getContentPane().add(password);
		
		uname = new JTextField();
		uname.setBounds(243, 76, 130, 26);
		frame.getContentPane().add(uname);
		uname.setColumns(10);
		
		psd = new JTextField();
		psd.setBounds(243, 137, 130, 26);
		frame.getContentPane().add(psd);
		psd.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(71, 193, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				RegisterForm a = new RegisterForm();
				a.run();
			}
		});
		btnRegister.setBounds(243, 193, 117, 29);
		frame.getContentPane().add(btnRegister);
	}
}
