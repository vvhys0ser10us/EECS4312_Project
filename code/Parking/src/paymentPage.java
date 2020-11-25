import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class paymentPage {
	private JFrame frame;
	public JTextField bookId;
	public int needtopay = 0;
	
	public paymentPage() {
		frame = new JFrame();
		frame.setTitle("PAYMENT METHOD");
		frame.setBounds(900, 500, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setVisible(true);
		
		JButton paypal = new JButton("PAYPAL");
		paypal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paid p = new paid();
				frame.dispose();

			}
		});
		paypal.setBounds(170, 70, 117, 29);
		frame.getContentPane().add(paypal);
		
		JButton credit = new JButton("CREDIT CARD");
		credit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paid p = new paid();
				frame.dispose();

			}
		});
		credit.setBounds(170, 140, 117, 29);
		frame.getContentPane().add(credit);
		
		JButton debit = new JButton("DEBIT CARD");
		debit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paid p = new paid();
				frame.dispose();
			}
		});
		debit.setBounds(170, 210, 117, 29);
		frame.getContentPane().add(debit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				payment p = new payment();
			}
		});
		btnBack.setBounds(170, 350, 117, 29);
		frame.getContentPane().add(btnBack);
		
	}
	
	
}
