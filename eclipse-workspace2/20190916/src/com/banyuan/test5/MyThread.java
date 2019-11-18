package com.banyuan.test5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;

import javax.swing.JTextArea;

public class MyThread extends Thread{
	private DatagramSocket ds;
	private JTextArea taReceive;
	
	
public MyThread(DatagramSocket ds, JTextArea taReceive) {
//		super();
		this.ds = ds;
		this.taReceive = taReceive;
	}
public void run() {
	while(true) {
		byte[] data = new byte[1024];
		DatagramPacket dp2 = new DatagramPacket(data, data.length);
		try {
			ds.receive(dp2);
			String str2 = dp2.getSocketAddress()+"=="+new Date()+"内容："+new String(dp2.getData(),0,dp2.getLength());
			taReceive.append(str2+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
}
