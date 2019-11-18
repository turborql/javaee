package com.banyuan.test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test1 {
	public static void main(String[] args) {
          //字节流 Stream(流入，流出)
//输入输出input  read(读)   
//		output   write(写)
		//字符流
		//abstract InputStream
		//OutputStream(->Closeable,Flushable):FileOutputStream(没有无参构造)
//		InputStream is=new FileInputStream("abc");	
//char>=0;最后一个不强转；
		//循环
//		 File file=new File("");//创建的文件在相对路径（如果没有指定路径的话）
//       InputStream is=new FileInputStream()
		try {
			OutputStream os=new FileOutputStream("ab");
			os.write("helo".getBytes());
			byte[] b=new byte[3];
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
