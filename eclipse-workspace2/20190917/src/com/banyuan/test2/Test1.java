package com.banyuan.test2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Test1 {
	public static void main(String[] args) {

			System.out.println("server port=10004");
			ServerSocket ss;
			try {
				ss = new ServerSocket(10004);
				Vector<Socket> sockets=new Vector<>();//为什么是Socket类型
			while (true) {
				System.out.println("accept");
				Socket s = ss.accept();
				sockets.add(s);
					MyThread mt=new MyThread(s,sockets);
					mt.start();
				}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

