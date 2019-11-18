package com.banyuan.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy1 {
public static void main(String[] args) {
	try {
		InputStream is=new FileInputStream("a");
		OutputStream os=new FileOutputStream("abcd");
		//定义字节数组，缓冲
		byte[] b=new byte[1024];
		//读取数组，写入数组
		int len=0;
		while((len=is.read(b))!=-1){
			os.write(b, 0, len);
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}

}
