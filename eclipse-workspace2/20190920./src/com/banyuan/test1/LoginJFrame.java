package com.banyuan.test1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class LoginJFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tx_user;
	private JTextField tx_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginJFrame frame = new LoginJFrame();
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
	public LoginJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		setBounds(100, 100, 450, 300);
		
		setSize(450,300);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 438, 266);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Lable_user = new JLabel("user");
		Lable_user.setBounds(57, 47, 61, 16);
		panel.add(Lable_user);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(57, 122, 61, 16);
		panel.add(lblPassword);
		
		tx_user = new JTextField();
		tx_user.setBounds(163, 42, 130, 26);
		panel.add(tx_user);
		tx_user.setColumns(10);
		
		tx_pw = new JTextField();
		tx_pw.setBounds(163, 117, 130, 26);
		panel.add(tx_pw);
		tx_pw.setColumns(10);
		
		JButton buttonLogin = new JButton("Login");
		buttonLogin.addActionListener(this);
		buttonLogin.setBounds(43, 192, 117, 29);
		panel.add(buttonLogin);
		
		JButton Button_reset = new JButton("reset");
		Button_reset.setBounds(263, 192, 117, 29);
		panel.add(Button_reset);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		String user=tx_user.getText();
//		String password=tx_pw.getText();
		
		MainJFrame frame=new MainJFrame();
		frame.setVisible(true);
		this.setVisible(false);
		
	}
}
