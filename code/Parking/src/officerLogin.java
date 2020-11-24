import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class officerLogin {

	private JFrame frame;
	private JTextField uname;
	private JTextField psd;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					officerLogin window = new officerLogin();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	
	public void run() {
		try {
			officerLogin window = new officerLogin();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public officerLogin() {
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
		frame.setTitle("officer_login");
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
				officerDB a= new officerDB();
				System.out.println(a.login(uname.getText(), psd.getText()));
				frame.dispose();
			}
		});
		btnLogin.setBounds(71, 193, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				officerReg a = new officerReg();
				a.run();
			}
		});
		btnRegister.setBounds(243, 193, 117, 29);
		frame.getContentPane().add(btnRegister);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcome a = new welcome();
				frame.dispose();
				a.run();
			}
		});
		btnBack.setBounds(6, 6, 117, 29);
		frame.getContentPane().add(btnBack);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin a = new Admin();
				frame.dispose();
				a.run();
			}
		});
		btnAdmin.setBounds(327, 6, 117, 29);
		frame.getContentPane().add(btnAdmin);
	}
}
