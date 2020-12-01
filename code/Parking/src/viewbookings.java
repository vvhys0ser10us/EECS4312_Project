import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class viewbookings {
//This feature shows a customer’s current parking booking. Information such as expiry time and
//payment status can be viewed.
	private JFrame frame;
	
	public viewbookings(){
		
		ArrayList<booking> list = new ArrayList<booking>();
		
		frame = new JFrame();
		frame.setTitle("VIEW BOOKING");
		frame.setBounds(900, 500, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setVisible(true);
		
		for(int i = 0; i < welcome.bookinglist.size(); i ++) {
			if(welcome.currentUser.equals(welcome.bookinglist.get(i).getUser())) {
				list.add(welcome.bookinglist.get(i));
			}
		}
		
		if(list.size() == 0) {
			JLabel Label = new JLabel("No Bookings" );
			Label.setBounds(175, 60, 200, 16);
			frame.getContentPane().add(Label);
		}else {
			for(int j = 0; j < list.size(); j++) {
				JLabel id = new JLabel("Booking ID :  " + list.get(j).getBookingId());
				id.setBounds(50, 30 + j*60, 200, 16);
				frame.getContentPane().add(id);
				
				JLabel expirytime = new JLabel("Expirytime :  " + list.get(j).getExpiryTime());
				expirytime.setBounds(80 , 50 + j*60, 250, 16);
				frame.getContentPane().add(expirytime);
				
				JLabel status = new JLabel("Status :  " + list.get(j).getStatusForViewBooking());
				status.setBounds(80 , 70 + j*60, 250, 16);
				frame.getContentPane().add(status);
			}
		}
		
		
		
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
	

}
