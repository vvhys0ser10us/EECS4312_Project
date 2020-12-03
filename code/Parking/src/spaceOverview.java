import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class spaceOverview {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					spaceOverview window = new spaceOverview();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	public void run() {
		try {
			spaceOverview window = new spaceOverview();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public spaceOverview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		for (int i =0;i<welcome.spacelist.size();i++) {
			textArea.append(welcome.spacelist.get(i).getId() +"	           "+ welcome.spacelist.get(i).getAddress() +"\n");
		}
		
		textArea.setBounds(77, 81, 287, 352);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Space Id");
		lblNewLabel.setBounds(77, 53, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(220, 53, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		


	}
}
