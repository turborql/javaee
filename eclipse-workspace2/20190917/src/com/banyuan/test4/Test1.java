package com.banyuan.test4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import java.util.Vector;

public class Test1 {
	public static void main(String[] args) {

			System.out.println("server port=10005");
			ServerSocket ss;
			try {
				ss = new ServerSocket(10005);
				Vector<Socket> sockets=new Vector<>();//为什么是Socket类型
				Vector<Friends> friendsList=new Vector<>();
				Friends f1=new Friends(10001,10002);
				Friends f2=new Friends(10001,10004); 
				Friends f3=new Friends(10002,10003);
				Friends f4=new Friends(10004,10003);
//				Friends f1=new Friends(10002,10001);
				
				friendsList.add(f1);
				friendsList.add(f2);
				friendsList.add(f3);
			while (true) {
				System.out.println("accept");
				Socket s = ss.accept();
				sockets.add(s);
				
					MyThread mt=new MyThread(s,sockets,friendsList);
					mt.start();
				}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

