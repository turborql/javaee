package com.banyuan.test2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("====receive");
		try {
			DatagramSocket ds = new DatagramSocket(10000);
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);// 此时数据包是空的
			while (true) {
				ds.receive(dp);
				System.out.println(new String(dp.getSocketAddress() + "向我发送了"
						+ new String(dp.getData(), 0, dp.getLength()) + "时间为：" + new Date()));
			}
		} catch (SocketException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
