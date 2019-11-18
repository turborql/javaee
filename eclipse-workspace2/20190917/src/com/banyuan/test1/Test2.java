package com.banyuan.test1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println("==client1 socket");
			Socket s = new Socket("127.0.0.1", 10004);
			System.out.println("port=" + s.getPort() + ",localPort=" + s.getLocalPort());
			OutputStream os = s.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);
			pw.println("hello");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
