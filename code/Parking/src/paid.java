import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class paid {
	private JFrame frame;
	private  Timer timer;
	int counter = 60;
	public paid() {
		frame = new JFrame();
		frame.setTitle("PAID");
		frame.setBounds(900, 500, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setVisible(true);
		
		JLabel paymentLabel = new JLabel("Thanks for the payment!");
		paymentLabel.setBounds(150, 150, 200, 16);
		frame.getContentPane().add(paymentLabel);
		
		JLabel countdown = new JLabel("Parking space expiry in  ");
		countdown.setBounds(115, 200, 200, 16);
		frame.getContentPane().add(countdown);
		
		JLabel t = new JLabel();
		t.setBounds(255, 200, 200, 16);
		frame.getContentPane().add(t);
		
		JLabel s = new JLabel(" seconds");
		s.setBounds(270, 200, 200, 16);
		frame.getContentPane().add(s);
		
		
		 timer = new Timer(1000, new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                t.setText(String.valueOf(counter));
	                counter--;
	                if (counter < 0) {
	                      timer.stop();
	                      welcome.currentBooking.completedStatus();
	                      welcome.currentBooking.getSpace().setOccupited(false);
	                      JOptionPane.showMessageDialog(null, "Your parking space is expiry!");
	                }
	            }
	        });
	        timer.start();
		
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
		new paid();
	}

}
