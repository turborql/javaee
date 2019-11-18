package com.banyuan.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Test1 { 
	public static void main(String[] args) { 
		try {
			System.out.println("server");
			ServerSocket ss = new ServerSocket(10002);
			Socket s = ss.accept();
            InputStream is=s.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String str=br.readLine();
            //打印端口
            System.out.println("port:"+s.getPort()+"localport"+s.getLocalPort()+"接收的内容"+str);
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}
