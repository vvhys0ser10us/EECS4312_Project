import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin {
	private adminDB admin;
	private JFrame frame;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//
//			}
//		});
//	}

	public void run() {
	try {
		Admin window = new Admin();

		window.frame.setVisible(true);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	/**
	 * Create the application.
	 */
	public Admin() {
		admin = new adminDB();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Admin Login");
		frame.setBounds(900, 500, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(128, 77, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		username = new JTextField();
		username.setBounds(201, 72, 130, 26);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (admin.check(username.getText(), new String(password.getPassword()))) {
					adminC a = new adminC();
					a.run();
					frame.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "fail");
				}
				System.out.println(admin.check(username.getText(), new String (password.getPassword())));
				
			}
		});
		btnConfirm.setBounds(162, 178, 117, 29);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//officerLogin a = new officerLogin();
				welcome a= new welcome();
				frame.dispose();
				a.run();
			}
		});
		btnBack.setBounds(6, 6, 117, 29);
		frame.getContentPane().add(btnBack);
		
		password = new JPasswordField();
		password.setBounds(201, 110, 130, 26);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		JLabel pwNewLabel = new JLabel("password");
		pwNewLabel.setBounds(128, 110, 61, 16);
		frame.getContentPane().add(pwNewLabel);
		
	}
}
