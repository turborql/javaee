package com.banyuan.test2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Test1 { 
	static String str;
	public static void main(String[] args) throws UnknownHostException, IOException {
    try {
    	System.out.println("send==");
		DatagramSocket ds=new DatagramSocket(10003);
		FileInputStream fis=new FileInputStream("3.png");
	    byte[] b=new byte[1024];
	    int len=0;
		while((len=fis.read(b))!=-1) {
			str=new String(b,0,len);
			DatagramPacket dp=new DatagramPacket(str.getBytes(),str.getBytes().length, InetAddress.getByName("127.0.0.1"),10004);
			ds.send(dp);
		}
	} catch (SocketException e) {
		e.printStackTrace();
	} 
    
	}
}
