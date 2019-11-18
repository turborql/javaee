package com.banyuan.test6;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class ClientJFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextArea taSend;
	private Socket s;
	private PrintWriter pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
					ClientJFrame frame = new ClientJFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the frame.
	 */
	public ClientJFrame() {
		setTitle("client1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(65, 47, 218, 192);
		contentPane.add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 127, 174, 44);
		panel.add(scrollPane);

		taSend = new JTextArea();
		taSend.setBackground(Color.PINK);
		scrollPane.setViewportView(taSend);

		JButton btSend = new JButton("发送");
		btSend.addActionListener(this);
		btSend.setBackground(Color.YELLOW);
		btSend.setBounds(95, 67, 117, 29);
		panel.add(btSend);
		setVisible(true);
	
		try {
//			s = new Socket("127.0.0.1", 10004);
			s = new Socket("127.0.0.1", 10004,InetAddress.getByName("127.0.0.1"),10001);
			System.out.println("port=" + s.getPort() + ",localPort=" + s.getLocalPort());
//			OutputStream os = s.getOutputStream();
//			 pw = new PrintWriter(os, true);
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e1) {
		
			System.out.println("==client1 socket");
			try {
//				s = new Socket("127.0.0.1", 10004,InetAddress.getByName("127.0.0.1"),10001);
//				System.out.println("port=" + s.getPort() + ",localPort=" + s.getLocalPort());
				OutputStream os = s.getOutputStream();  
				pw = new PrintWriter(os, true);
				pw.println(taSend.getText());
				pw.flush();
//				pw.close();
//				s.close();
				taSend.setText("");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
}
