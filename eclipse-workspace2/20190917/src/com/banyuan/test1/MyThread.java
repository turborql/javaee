package com.banyuan.test1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class MyThread extends Thread {
	private Socket s;

	public MyThread(Socket s) {
		this.s = s;
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
						os = s.getOutputStream();
					PrintWriter pw=new PrintWriter(os,true);
					pw.println("接收成功"+str);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
