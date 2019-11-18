package com.banyuan.test4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;
public class Send1 {
	public static void main(String[] args) {
		System.out.println("---send---");
		try {
			DatagramSocket ds =new DatagramSocket(10000);
			//String str="庄";
			Scanner sc=new Scanner(System.in);
			while(true) {				
				String str=sc.next();
				DatagramPacket dp =new DatagramPacket(str.getBytes(), str.getBytes().length, new InetSocketAddress("localhost",10001));
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
