package com.banyuan.test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class MyJFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField usertextField;
	private JPasswordField passwordtextField;
	ArrayList list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyJFrame frame = new MyJFrame();
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
	public MyJFrame() {
		list = new ArrayList();
		User u1 = new User("zhangsan", "123");
		User u2 = new User("lisi", "123");
		list.add(u1);
		list.add(u2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setSize(450, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel UserlblNewLabel = new JLabel("用户名");
		UserlblNewLabel.setBounds(81, 50, 39, 16);
		contentPane.add(UserlblNewLabel);

		usertextField = new JTextField();
		usertextField.setBounds(172, 45, 130, 26);
		contentPane.add(usertextField);
		usertextField.setColumns(10);

		JLabel passwordlblNewLabel = new JLabel("密码");
		passwordlblNewLabel.setBounds(81, 112, 61, 16);
		contentPane.add(passwordlblNewLabel);

		passwordtextField = new JPasswordField();
		passwordtextField.setBackground(new Color(255, 255, 255));
		passwordtextField.setBounds(172, 107, 130, 26);
		contentPane.add(passwordtextField);
		passwordtextField.setColumns(10);

		JButton dlbtnNewButton = new JButton("登陆");
		dlbtnNewButton.addActionListener(this);
		dlbtnNewButton.setBounds(81, 184, 117, 29);
		contentPane.add(dlbtnNewButton);

		JButton resetbtnNewButton = new JButton("重置");
		resetbtnNewButton.addActionListener(this);
		resetbtnNewButton.setBounds(242, 184, 117, 29);
		contentPane.add(resetbtnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/edz/eclipse-workspace2/20190821/bin/com/banyuan/test1/屏幕快照 2019-08-21 下午8.42.30.png"));
		lblNewLabel.setBounds(0, 0, 450, 272);
		contentPane.add(lblNewLabel);
	}

	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getActionCommand());
		if ("登陆".equals(e.getActionCommand())) {
			String name = usertextField.getText();			
			String password = passwordtextField.getText();
			
			for (int i = 0; i < list.size(); i++) {
				User u=(User)list.get(i);
				if (u.getName().equals(name)&&u.getPassword().equals(password)) {	
					         MainFrame mf =new MainFrame();
					         mf.setVisible(true);
					         this.setVisible(false);
				}else {
					EorroFrame ef=new EorroFrame();
					ef.setVisible(true);
					this.setVisible(false);
				}
			}
		} else if ("重置".equals(e.getActionCommand())) {
			usertextField.setText("");
			passwordtextField.setText("");
		}

	}
}
