import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterForm {

	private JFrame frame;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField email;
	private JTextField password;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//
//			}
//		});
//	}

	/**
	 * Create the application.
	 */

	public void run() {
	try {
		RegisterForm window = new RegisterForm();
		window.frame.setVisible(true);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	public RegisterForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();

		frame.setTitle("custmoer_register");
		frame.setBounds(900, 500, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Firstname");
		lblNewLabel.setBounds(63, 105, 87, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lastname");
		lblNewLabel_1.setBounds(63, 162, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("email");
		lblNewLabel_2.setBounds(63, 222, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setBounds(63, 294, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		firstname = new JTextField();
		firstname.setBounds(255, 100, 130, 26);
		frame.getContentPane().add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setBounds(255, 157, 130, 26);
		frame.getContentPane().add(lastname);
		lastname.setColumns(10);
		
		email = new JTextField();
		email.setBounds(255, 222, 130, 26);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		password = new JTextField();
		password.setBounds(255, 289, 130, 26);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		JButton btnConfirm = new JButton("confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userAccount newCust = new userAccount(firstname.getText(),lastname.getText(),email.getText(),password.getText());
				userDB a = new userDB();
				a.register(newCust);
				frame.dispose();
				login b = new login();
				b.run();
				JOptionPane.showMessageDialog(null, "Done");

			}
		});
		btnConfirm.setBounds(166, 372, 117, 29);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcome a = new welcome();
				frame.dispose();
				a.run();
			}
		});
		btnBack.setBounds(7, 6, 117, 29);
		frame.getContentPane().add(btnBack);
	}

}
