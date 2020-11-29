import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminPay {///////////////////////
	private JFrame frame;
	
	public void run() {
		try {
			adminPay window = new adminPay();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public adminPay() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(900, 500, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCPStatus = new JButton("Change Payment Status");
		btnCPStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				managePayment manage = new managePayment();
				manage.run();
				frame.dispose();
			}
			
		});
		btnCPStatus.setBounds(105, 95, 225, 50);
		frame.getContentPane().add(btnCPStatus);
	}
}
