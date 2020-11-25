import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class bookingSuccess {
	private JFrame frame;
	
	public bookingSuccess() {
		frame = new JFrame();

		frame.setTitle("SUCCESSFUL");
		frame.setBounds(900, 500, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel Label = new JLabel("BOOKING SUCCESSFUL" );
		Label.setBounds(150, 60, 200, 16);
		frame.getContentPane().add(Label);
		
		JLabel Label1 = new JLabel("BOOKING ID : " + welcome.currentBooking.getBookingId());
		Label1.setBounds(150, 125, 200, 16);
		frame.getContentPane().add(Label1);
		
		JLabel Label2 = new JLabel("Space Number : " + welcome.currentBooking.getspaceId());
		Label2.setBounds(150, 150, 200, 16);
		frame.getContentPane().add(Label2);
		
		JLabel Label3 = new JLabel("Name : " + welcome.currentUser.getName());
		Label3.setBounds(150, 175, 200, 16);
		frame.getContentPane().add(Label3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				userWindow a = new userWindow();
			}
		});
		btnBack.setBounds(165, 372, 117, 29);
		frame.getContentPane().add(btnBack);
	}

	
	public static void main(String[] args) {
		new bookingSuccess();
		
	}
}
