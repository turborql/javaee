package com.banyuan.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test1 {
//这种只能打印一个一个字符int read()
	public static void main(String[] args) {
		try {
			OutputStream os=new FileOutputStream("111");
			os.write("hello".getBytes());
			InputStream is=new FileInputStream("111");
		   int a;
		    while((a=is.read())!=-1) {
		    	System.out.print((char)a);
		    }
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
