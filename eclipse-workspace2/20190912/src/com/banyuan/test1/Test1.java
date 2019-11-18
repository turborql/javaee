package com.banyuan.test1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test1 {
public static void main(String[] args) {
	try {
		InetAddress ia1=InetAddress.getByName("192.168.10.246");
	System.out.println(ia1);
	System.out.println(ia1.getHostAddress());
	System.out.println(ia1.getHostName());
	
	InetAddress ia2=InetAddress.getByName("localhost");//本机IP地址
	System.out.println(ia2);
	System.out.println(ia2.getHostAddress());
	System.out.println(ia2.getHostName());
	
	InetAddress ia3=InetAddress.getByName("127.0.0.1");//本机IP地址
	System.out.println(ia3);
	System.out.println(ia3.getHostAddress());
	System.out.println(ia3.getHostName());
	
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
