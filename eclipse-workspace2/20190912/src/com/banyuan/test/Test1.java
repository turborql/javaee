package com.banyuan.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Test1 {
public static void main(String[] args) {
	System.out.println("=======receive");
	try {
		DatagramSocket ds=new DatagramSocket(10001);
		byte[] b=new byte[1024];
		DatagramPacket dp=new DatagramPacket(b,b.length);
		while(true) {
			byte[] data=dp.getData();
			ds.receive(dp);
			System.out.println(new String(data));	
			
			
		}
	} catch (SocketException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
