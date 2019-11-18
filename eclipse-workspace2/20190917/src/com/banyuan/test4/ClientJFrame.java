package com.banyuan.test4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
	private JTextArea tareceive;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ClientJFrame frame = new ClientJFrame();
	}

	/**
	 * Create the frame.
	 */
	public ClientJFrame() {
		setTitle("zhangsan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(65, 47, 553, 295);
		contentPane.add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 108, 174, 44);
		panel.add(scrollPane);

		taSend = new JTextArea();
		taSend.setBackground(Color.PINK);
		scrollPane.setViewportView(taSend);

		JButton btSend = new JButton("好友群发");
		btSend.addActionListener(this);
		btSend.setBackground(Color.YELLOW);
		btSend.setBounds(101, 157, 87, 29);
		panel.add(btSend);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(18, 23, 515, 58);
		panel.add(panel_1);
		panel_1.setLayout(null);

		tareceive = new JTextArea();
		tareceive.setBackground(Color.YELLOW);
		tareceive.setBounds(6, 6, 503, 46);
//		panel_1.add(tareceive);

		JScrollPane scrollPane_1 = new JScrollPane(tareceive);
//		scrollPane_1.add(tareceive);
		scrollPane_1.setBounds(6, 6, 503, 46);
		panel_1.add(scrollPane_1);
		setVisible(true);

		try {
			s = new Socket("127.0.0.1", 10005, InetAddress.getByName("127.0.0.1"), 10001);
			System.out.println("port=" + s.getPort() + ",localPort=" + s.getLocalPort());
			InputStream is = s.getInputStream();
			while (true) {
				is = s.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String str = br.readLine();
				if (str != null) {
					// 将文字打印到图形界面
					tareceive
							.append("port=" + s.getPort() + "localport=" + s.getLocalPort() + "接收的内容str=" + str + "\n");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e1) {

		System.out.println("==client1 socket");
		try {
			OutputStream os = s.getOutputStream();
			pw = new PrintWriter(os, true);
			pw.println(taSend.getText());
			pw.flush();
			taSend.setText("");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
