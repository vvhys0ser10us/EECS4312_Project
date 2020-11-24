import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class viewbookings {
//This feature shows a customer’s current parking booking. Information such as expiry time and
//payment status can be viewed.
	private JFrame frame;
	
	public viewbookings(){
		
		frame = new JFrame();
		frame.setTitle("VIEW BOOKING");
		frame.setBounds(900, 500, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setVisible(true);
		
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
