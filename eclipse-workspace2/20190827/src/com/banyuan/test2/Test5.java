package com.banyuan.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test5 {

	public static void main(String[] args) {
		try {
			OutputStream os=new FileOutputStream("555");
			InputStream is=new FileInputStream("444");
			byte[] b=new byte[1024];
			int a;
			while((a=is.read(b))!=-1) {
				os.write(b);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
