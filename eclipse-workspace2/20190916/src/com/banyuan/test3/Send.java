package com.banyuan.test3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;
import java.util.Scanner;
 
public class Send {
	public static void main(String[] args) {
		try {
			//创建端口
			DatagramSocket ds = new DatagramSocket(10000);
			//输入数据，发送到接收方端口
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.print("请输入内容：");
			String str = sc.nextLine();//回车才算结束
			DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length,
					InetAddress.getByName("127.0.0.1"), 10002);
				ds.send(dp);
			 	
				byte[] buf = new byte[1024];
				DatagramPacket dp2 = new DatagramPacket(buf, buf.length);
				ds.receive(dp2);
				System.out.println(dp2.getSocketAddress()+"；时间："+new Date()+";内容："+new String(dp2.getData(),0,dp2.getLength()));

			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
