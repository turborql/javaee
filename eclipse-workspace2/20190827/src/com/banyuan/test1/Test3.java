package com.banyuan.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test3 {
public static void main(String[] args) {
	InputStream is=null;
	OutputStream os=null;
	try {
		is=new FileInputStream("1.png");//字节输入流，字符串变成文件名
		os=new FileOutputStream("2.png");
		byte[] b=new byte[1024]; 
		int a=0;
		while((a=is.read(b))!=-1) {
			os.write(b, 0, a);
		}
		os.flush();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
