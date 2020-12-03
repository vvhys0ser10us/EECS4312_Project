import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class managePayment {/////////////////
	private JFrame frame;
	private JTextField email;
	
	public void run() {
		try {
			managePayment window = new managePayment();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public managePayment() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(900, 500, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Customer Email");
		lblNewLabel_2.setBounds(63, 118, 150, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		email = new JTextField();
		email.setBounds(255, 113, 130, 26);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		
		JButton paid = new JButton("Paid");
		paid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!email.getText().isEmpty() && welcome.userList.contains(email.getText())) {
					for (int i=0;i<welcome.bookinglist.size();i++){
						if (welcome.bookinglist.get(i).getUser().getEmail().equals(email.getText()) && welcome.bookinglist.get(i).customerPaidstatus()) {
							welcome.bookinglist.get(i).paidStatus();
						}
		}
				JOptionPane.showMessageDialog(null, "The status has been updated to: Paid ");
				}
				else JOptionPane.showMessageDialog(null, "Check input ");

			}
		});
		paid.setBounds(63, 218, 117, 29);
		frame.getContentPane().add(paid);
		
		JButton unpaid = new JButton("Unpaid");
		unpaid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!email.getText().isEmpty() && welcome.userList.contains(email.getText())) {
					for (int i=0;i<welcome.bookinglist.size();i++){
						if (welcome.bookinglist.get(i).getUser().getEmail().equals(email.getText()) && !welcome.bookinglist.get(i).customerPaidstatus()) {
							System.out.println(welcome.bookinglist.get(i).getStatusForViewBooking());
						}
		}
				JOptionPane.showMessageDialog(null, "The status has been updated to: Unpaid ");
				}
				else JOptionPane.showMessageDialog(null, "Check input ");

			}
		});
		unpaid.setBounds(268, 218, 117, 29);
		frame.getContentPane().add(unpaid);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminC a = new adminC();
				frame.dispose();
				a.run();
				
			}
		});
		btnBack.setBounds(6, 6, 117, 29);
		frame.getContentPane().add(btnBack);
		
	}
	
	
}
