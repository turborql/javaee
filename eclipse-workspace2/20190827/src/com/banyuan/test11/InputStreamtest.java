package com.banyuan.test11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamtest {
public static void main(String[] args) throws IOException {
	InputStream is=new FileInputStream("two");
	
	//第一种一个个字节的读
	int len=is.read();
	System.out.println(len);
	while((len=is.read())!=-1) {
		System.out.println((char)len);
	}
	
	//数组读
	/*byte[] b=new byte[1024];
	int len=0;
	while  ( (len=is.read(b))!=-1) {
		System.out.println(new String(b,0,len));
	}
	is.close();*/
}
}
