package com.banyuan.test2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Test1 { 
	public static void main(String[] args) {
		System.out.println("send====");
	try {
		//创建服务端和端口（创建套接字）//指定端口是发送方的端口
			DatagramSocket ds = new DatagramSocket(10000);
			//准备数据
			System.out.println("请输入内容");
			Scanner sc = new Scanner(System.in);
			while (true) {
				String str = sc.nextLine();
//				打包（发送的地点及端口）
				DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length,
						InetAddress.getByName("127.0.0.1"), 10001);
				//发送数据
				ds.send(dp);
			}

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
