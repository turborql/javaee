package com.banyuan.test2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Test2 {
public static void main(String[] args) {
	try {
		DatagramSocket ds=new DatagramSocket(10004);
		FileOutputStream fos=new FileOutputStream("3.png");
		byte[] buf=new byte[1024]; 
		fos.write(buf);
	DatagramPacket dp=new DatagramPacket(buf,buf.length);
	while(true) { 
		ds.receive(dp);
		System.out.println(new String(dp.getData(),0,dp.getLength()) );
	}
	} catch (SocketException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

	}
}
