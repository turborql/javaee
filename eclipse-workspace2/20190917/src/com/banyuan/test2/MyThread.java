package com.banyuan.test2;

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
	public MyThread(Socket s,Vector<Socket> sockets) {
		this.s = s;
		this.sockets=sockets;
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
//						os = s.getOutputStream();
//					PrintWriter pw=new PrintWriter(os,true);
//					pw.println("接收成功"+str);
						System.out.println("socket:"+sockets);
						for(int i=0;i<sockets.size();i++) {//为什么不用迭代器
							os=sockets.get(i).getOutputStream();
							PrintWriter pw=new PrintWriter(os,true);
							pw.println("接收成功"+str);
							
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
