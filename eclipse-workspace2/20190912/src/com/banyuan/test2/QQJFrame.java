package com.banyuan.test2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class QQJFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private DatagramSocket ds;
	JTextArea taRecive;
	JTextArea taSend;
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
		setBounds(100, 100, 793, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 783, 800);
		contentPane.add(panel);
		panel.setLayout(null);

	 taSend = new JTextArea();
		taSend.setBackground(Color.PINK);
		taSend.setBounds(20, 50, 600, 160);
		// panel.add(taSend);

		JScrollPane scrollPane = new JScrollPane(taSend);
		scrollPane.setBounds(20, 50, 600, 160);
		panel.add(scrollPane);

		 taRecive = new JTextArea();
		taRecive.setBackground(Color.YELLOW);
		taRecive.setBounds(20, 260, 600, 160);
		// panel.add(taRecive); 

		JScrollPane scrollPane_1 = new JScrollPane(taRecive);
		scrollPane_1.setBounds(20, 260, 600, 160);
		panel.add(scrollPane_1);
		
		JLabel label = new JLabel("接收内容");
		label.setBounds(25, 25, 61, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("发送内容");
		label_1.setBounds(20, 233, 61, 16);
		panel.add(label_1);
		
		JButton btnNewButton = new JButton("发送");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(503, 445, 117, 29);
		panel.add(btnNewButton);
		try {
			ds = new DatagramSocket(10001);
		} catch (SocketException e) {
			e.printStackTrace();
		}
	} 

	@Override
	public void actionPerformed(ActionEvent e) {
		String str=taSend.getText();
		DatagramPacket dp;  
	 try {  
		dp = new DatagramPacket(str.getBytes(), str.getBytes().length,
						InetAddress.getLocalHost(), 10000);
		ds.send(dp);
	   taSend.setText(" ");
		byte[] buf=new byte[1024];
		DatagramPacket dp2=new DatagramPacket(buf,buf.length);//此时数据包是空的		
			ds.receive(dp2);
		String reContent=dp.getSocketAddress()+"向我发送了"+new String(dp.getData(),0,dp.getLength())+"时间为："+new Date();
	    taRecive.append(reContent+"\n");
		
	 } catch (UnknownHostException e1) {
		e1.printStackTrace();
	} catch (IOException e2) {
		e2.printStackTrace();
	}
	}  
			
			
	}
		
