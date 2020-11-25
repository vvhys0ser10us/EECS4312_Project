import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class officerIn {

	private JFrame frame;

	/**
	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//
//	}

	/**
	 * Create the application.
	 */
		public void run() {
			try {
				officerIn window = new officerIn();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	public officerIn() {
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
		
		JButton btnManagerSpace = new JButton("Manage space");
		btnManagerSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				manageSpace a = new manageSpace();
				a.run();
			}
		});
		btnManagerSpace.setBounds(162, 28, 117, 29);
		frame.getContentPane().add(btnManagerSpace);
		
		JButton btnView = new JButton("View Bookings");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				officerviewBooking a = new officerviewBooking();
				a.run();
			}
		});
		btnView.setBounds(162, 101, 117, 29);
		frame.getContentPane().add(btnView);
	}

}
