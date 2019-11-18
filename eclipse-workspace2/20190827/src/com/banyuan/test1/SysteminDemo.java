package com.banyuan.test1;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class SysteminDemo {
public static void main(String[] args) {
	InputStream is=System.in;
	try {
		URL u=new URL("http://www.baidu.com");
		
	} catch (MalformedURLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	try {
		System.out.println((char)(is.read()));
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
