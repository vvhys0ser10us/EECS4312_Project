import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class adminIn {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminIn window = new adminIn();
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
	public adminIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(165, 89, 115, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("email");
		lblNewLabel_2.setBounds(125, 92, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnAdd = new JButton("add officer");
		btnAdd.setBounds(78, 178, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("delete officer");
		btnDelete.setBounds(264, 178, 115, 23);
		frame.getContentPane().add(btnDelete);
	}
}
