import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class bookSpace {
//This feature allows a customer to select which parking space, and how long they want to book it for.
	private JFrame frame;
	private JTextField spaceId;
	private JTextField sTime;
	private JTextField eTime;
	private JTextField plateId;

	
	public bookSpace() {
	
		frame = new JFrame();

		frame.setTitle("BOOK SPACE");
		frame.setBounds(900, 500, 450, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Parking Space Number");
		lblNewLabel.setBounds(63, 105, 200, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Booking Time:  from");
		lblNewLabel_1.setBounds(63, 162, 200, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To");
		lblNewLabel_2.setBounds(150, 202, 200, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("License Plate Number");
		lblNewLabel_3.setBounds(63, 282, 200, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		spaceId = new JTextField();
		spaceId.setBounds(255, 100, 130, 26);
		frame.getContentPane().add(spaceId);
		spaceId.setColumns(10);
		
		sTime = new JTextField();
		sTime.setBounds(255, 157, 130, 26);
		frame.getContentPane().add(sTime);
		sTime.setColumns(10);
		
		eTime = new JTextField();
		eTime.setBounds(255, 202, 130, 26);
		frame.getContentPane().add(eTime);
		eTime.setColumns(10);
		
		plateId = new JTextField();
		plateId.setBounds(255, 282, 130, 26);
		frame.getContentPane().add(plateId);
		plateId.setColumns(10);
		
		frame.setVisible(true);
		
		JButton btnConfirm = new JButton("confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				//welcome.db

			}
		});
		btnConfirm.setBounds(70, 372, 117, 29);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				userWindow a = new userWindow();

			}
		});
		btnBack.setBounds(270, 372, 117, 29);
		frame.getContentPane().add(btnBack);

	}
	
	public static void main(String[] args) {
		new bookSpace();
	}

	
}
