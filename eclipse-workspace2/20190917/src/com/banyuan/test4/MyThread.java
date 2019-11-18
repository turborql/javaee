package com.banyuan.test4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

public class MyThread extends Thread {
	private Socket s;
	private Vector<Socket> sockets;
	private Vector<Friends> friendsList;

	public MyThread(Socket s, Vector<Socket> sockets, Vector<Friends> friendsList) {
		this.s = s;
		this.sockets = sockets;
		this.friendsList = friendsList;
	}

	public void run() {
		if (s != null) {
			while (true) {
				InputStream is;
				OutputStream os;
				try {
					is = s.getInputStream();
					BufferedReader br = new BufferedReader(new InputStreamReader(is));
					String str = br.readLine();
					if (str != null) {
						System.out.println("port=" + s.getPort() + "localport=" + s.getLocalPort() + "str=" + str);
						System.out.println("socket:" + sockets);
						for (int i = 0; i < sockets.size(); i++) {
							// 通过friendsList中的port查找好友
							int self = s.getPort();
							for (int j = 0; j < friendsList.size(); j++) {
								Friends f = friendsList.get(j);
								int a = f.getP1();
								int b = f.getP2();
								if ((self == a && sockets.get(i).getPort() == b)
										|| self == b && sockets.get(i).getPort() == a) {
									os = sockets.get(i).getOutputStream();
									PrintWriter pw = new PrintWriter(os, true);
									pw.println("接收成功" + str);
								}
							}
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
