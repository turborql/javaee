package com.banyuan.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test4 {
public static void main(String[] args) {
	try {
		OutputStream os=new FileOutputStream("444");
//		os.write("abc".getBytes());
		byte[] b=new byte[1024];
		InputStream is=new FileInputStream("333");
		int a;
		while((a=is.read(b))!=-1) {
			os.write(b);
		}	
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	
}
}
