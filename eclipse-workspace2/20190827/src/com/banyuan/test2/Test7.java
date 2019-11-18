package com.banyuan.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test7 {
public static void main(String[] args) {
	try {
		OutputStream os=new FileOutputStream("777");
		os.write("seven".getBytes());
		InputStream is=new FileInputStream("222");
		int a;
		byte[] b=new byte[1024];
		while((a=is.read(b))!=-1) {
			System.out.println(new String(b,0,a));
			os.write(b, 0, a);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
