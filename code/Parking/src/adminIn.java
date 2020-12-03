import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminIn {

	private JFrame frame;
	private JTextField email;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					adminIn window = new adminIn();
//					window.frame.setVisible(true);
//					welcome.officerlist.add("1111");
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public void run() {
		try {
			adminIn window = new adminIn();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		frame.setBounds(900, 500, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		email = new JTextField();
		email.setBounds(264, 146, 115, 20);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("email");
		lblNewLabel_2.setBounds(303, 120, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnAdd = new JButton("add officer");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				officerReg a = new officerReg();
				a.run();
				frame.dispose();
			}
		});
		btnAdd.setBounds(50, 178, 101, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("delete officer");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				officerDB a = new officerDB();
				if (email.getText().isEmpty()) JOptionPane.showMessageDialog(null, "email cannot be empty"); 
				else if (welcome.officerlist.contains(email.getText())) {
				a.delete(email.getText());
				welcome.officerlist.remove(email.getText());
				System.out.println(welcome.officerlist);
				JOptionPane.showMessageDialog(null, "Done");
				frame.dispose();
				run();
				}
				else JOptionPane.showMessageDialog(null, "No such email");
			}
		});
		btnDelete.setBounds(264, 178, 115, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				adminC a = new adminC();
				a.run();
			}
		});
		btnBack.setBounds(6, 6, 117, 29);
		frame.getContentPane().add(btnBack);
	}
}
