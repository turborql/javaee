package com.banyuan.test4;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Date;
public class Recive {
	public static void main(String[] args) {
		System.out.println("---receive---");
		try {
			DatagramSocket ds =new DatagramSocket(10001);
			byte[] buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf, buf.length);
			String str="接受成功";
			while(true) {
				ds.receive(dp);
				System.out.println(dp.getSocketAddress()+"=="+new Date()+"内容："+new String(dp.getData(),0,dp.getLength()));	
				DatagramPacket dp2 =new DatagramPacket(str.getBytes(), str.getBytes().length, new InetSocketAddress("localhost",10000));
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
