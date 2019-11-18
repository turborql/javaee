package com.banyuan.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1 {
	public static void main(String[] args) {

			System.out.println("server port=10004");
			ServerSocket ss;
			try {
				ss = new ServerSocket(10004);
			while (true) {
				System.out.println("accept");
				Socket s = ss.accept();
					MyThread mt=new MyThread(s);
					mt.start();
				}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

