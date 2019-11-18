package com.banyuan.test3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class QQJFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private DatagramSocket ds;
	private JTextArea ta_send;
	private JTextArea ta_receive;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QQJFrame frame = new QQJFrame();
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
	public QQJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
//		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(101, 36, 453, 104);
		contentPane.add(scrollPane);
		
		ta_send = new JTextArea();
		ta_send.setBackground(Color.PINK);
		
	    
		scrollPane.setViewportView(ta_send);
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(111, 211, 443, 104);
		contentPane.add(scrollPane_1);
		
		 ta_receive = new JTextArea();
		ta_receive.setBackground(Color.YELLOW);
		scrollPane_1.setViewportView(ta_receive);
		
		JButton button = new JButton("发送");
		button.addActionListener(this);
		button.setBounds(126, 352, 117, 29);
		contentPane.add(button);
		
		JLabel label = new JLabel("接收内容");
		label.setBounds(101, 8, 61, 16);
		contentPane.add(label);
		 
		JLabel label_1 = new JLabel("发送内容");
		label_1.setBounds(111, 186, 61, 16);
		contentPane.add(label_1);
		try {
			 ds = new DatagramSocket(10000);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str=ta_send.getText();
			try {
				DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length,
				InetAddress.getByName("127.0.0.1"), 10002);
				ds.send(dp);
				ta_send.setText("");
				byte[] buf = new byte[1024];
				DatagramPacket dp2 = new DatagramPacket(buf, buf.length);
				ds.receive(dp2);
				String reContent=dp2.getSocketAddress()+"；时间："+new Date()+";内容："+new String(dp2.getData(),0,dp2.getLength());
				ta_receive.append(reContent+"\n");
				
//				System.out.println(dp2.getSocketAddress()+"；时间："+new Date()+";内容："+new String(dp2.getData(),0,dp2.getLength()));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			

		
	}
		
}
