import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.Color;

public class MyFrame extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setBounds(100, 100, 450, 300);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("user");
		rdbtnNewRadioButton.setBackground(Color.GREEN);
		getContentPane().add(rdbtnNewRadioButton, BorderLayout.CENTER);

	}

}
