package com.banyuan.test3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;

public class Receive {
	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(10002);
			//开空间
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);// 这句啥意思
			String str = "接收成功";
			while (true) {
				ds.receive(dp); 
				System.out.println(dp.getSocketAddress()+"；时间："+new Date()+";内容："+new String(dp.getData(),0,dp.getLength()));
				//把“接收成功”传给send
				DatagramPacket dp2 = new DatagramPacket(str.getBytes(), str.getBytes().length,
						InetAddress.getByName("127.0.0.1"), 10000);
				ds.send(dp2);
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
