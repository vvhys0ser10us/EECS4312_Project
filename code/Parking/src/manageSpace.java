import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class manageSpace {

	private JFrame frame;
	private JTextField spaceId;
	private JTextField address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manageSpace window = new manageSpace();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void run() {
		try {
			manageSpace window = new manageSpace();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public manageSpace() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(900, 500, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add space");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!welcome.spaceIDlist.contains(spaceId.getText()) && !spaceId.getText().isEmpty()) {
					welcome.spaceIDlist.add(spaceId.getText());
					Space a = new Space(spaceId.getText(),address.getText());
					welcome.spacelist.add(a);
					JOptionPane.showMessageDialog(null, "Done");

				}
				else if(spaceId.getText().isEmpty()){ 
				JOptionPane.showMessageDialog(null, "Enter Id");
				}
				else JOptionPane.showMessageDialog(null, "Already added");

			}
		});
			
		btnAdd.setBounds(64, 162, 117, 29);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDelete = new JButton("Delete space");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (spaceId.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Enter Id");
				else if (welcome.spaceIDlist.contains(spaceId.getText())) {
					welcome.spaceIDlist.remove(spaceId.getText());

					for (int i=0;i<welcome.spacelist.size();i++) {
						if (welcome.spacelist.get(i).getId()==spaceId.getText()) {
							welcome.spacelist.remove(i);	
						}
					}
					JOptionPane.showMessageDialog(null, "Removed");
				}
				else JOptionPane.showMessageDialog(null, "No such spaceID");
			}
		});
		btnDelete.setBounds(262, 162, 117, 29);
		frame.getContentPane().add(btnDelete);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				officerIn a = new officerIn();
				a.run();
			}
		});
		btnBack.setBounds(6, 6, 117, 29);
		frame.getContentPane().add(btnBack);
		
		spaceId = new JTextField();
		spaceId.setBounds(166, 64, 130, 26);
		frame.getContentPane().add(spaceId);
		spaceId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("space Id");
		lblNewLabel.setBounds(93, 69, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		address = new JTextField();
		address.setBounds(166, 113, 130, 26);
		frame.getContentPane().add(address);
		address.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(93, 118, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!spaceId.getText().isEmpty() && welcome.spaceIDlist.contains(spaceId.getText())) {
				boolean a=false;
				for (int i=0;i<welcome.spacelist.size();i++) {
					if (welcome.spacelist.get(i).getId().equals(spaceId.getText())) {
						a = welcome.spacelist.get(i).getOccupied();
						System.out.println(welcome.spacelist.get(i).getId());
					}
				}
				if (a) JOptionPane.showMessageDialog(null, "Occupied");
				else JOptionPane.showMessageDialog(null, "Not Occupied");
			}
				else if (spaceId.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Enter ID");
				else  JOptionPane.showMessageDialog(null, "No such space");
			}
			
			
		});
		btnCheck.setBounds(262, 203, 117, 29);
		frame.getContentPane().add(btnCheck);
	}
}
