package com.banyuan.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	try {
		DatagramSocket ds=new DatagramSocket(10000);
//		String str="hello";
//		InetAddress ia1=InetAddress.getByName("127.0.0.1"）封装ip
		
//		DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),InetAddress.getByName("127.0.0.1"), 10001);
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("请输入：");
			String str=sc.next();
			DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),InetAddress.getLocalHost(), 10001);
			ds.send(dp);
		}
		
			} catch (SocketException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
