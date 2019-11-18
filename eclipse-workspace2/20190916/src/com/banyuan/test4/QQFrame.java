package com.banyuan.test4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class QQFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private DatagramSocket ds;
	private JTextArea taReceive;
	private JTextArea taSend;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQFrame frame = new QQFrame();
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
	public QQFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		taReceive = new JTextArea();
		taReceive.setBackground(Color.RED);
		taReceive.setBounds(44, 54, 604, 118);

		taSend = new JTextArea();
		taSend.setBackground(Color.YELLOW);
		taSend.setBounds(44, 233, 604, 136);

		JScrollPane scrollPane = new JScrollPane(taReceive);
		scrollPane.setBounds(44, 54, 604, 118);
		panel.add(scrollPane);

		JScrollPane scrollPane_1 = new JScrollPane(taSend);
		scrollPane_1.setBounds(44, 233, 604, 136);
		panel.add(scrollPane_1);

		JLabel lblNewLabel = new JLabel("接收：");
		lblNewLabel.setBounds(44, 25, 147, 16);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("发送：");
		lblNewLabel_1.setBounds(44, 205, 111, 16);
		panel.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("发送");
		btnNewButton.setBounds(418, 401, 117, 29);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		try {
			ds = new DatagramSocket(10000);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = taSend.getText();

		try {
			DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length,
					new InetSocketAddress("localhost", 10001));
			ds.send(dp);
			taSend.setText("");
			byte[] data = new byte[1024];
			DatagramPacket dp2 = new DatagramPacket(data, data.length);
			ds.receive(dp2);
			String str2 = dp.getSocketAddress()+"=="+new Date()+"内容："+new String(dp2.getData(),0,dp2.getLength());
			taReceive.append(str2+"\n");

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
