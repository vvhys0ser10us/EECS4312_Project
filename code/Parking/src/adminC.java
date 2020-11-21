import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminC {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					adminC window = new adminC();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public void run() {
		try {
			adminC window = new adminC();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public adminC() {
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
		
		JButton btnOfficer = new JButton("manage Officer");
		btnOfficer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminIn a = new adminIn();
				a.run();
				frame.dispose();
			}
		});
		btnOfficer.setBounds(22, 113, 150, 29);
		frame.getContentPane().add(btnOfficer);
		
		JButton btnPayment = new JButton("manage Payment");
		btnPayment.setBounds(274, 113, 150, 29);
		frame.getContentPane().add(btnPayment);
	}
}
