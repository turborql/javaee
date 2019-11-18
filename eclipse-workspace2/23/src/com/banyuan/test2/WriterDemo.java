package com.banyuan.test2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;//字符输出流
public class WriterDemo {
//1.Write(int c)写一个字符
//2.write(char[] c)写字符数组
//3.write(char[],int,int)写字符数组一部分，开始索引，写几个
//4.write(String s)写入字符串
	public static void main(String[] args) {
		try {
			Writer w=new FileWriter("1");		
			w.write(100);
			//字符输出流写数据的时候，必须要运行刷新功能flush
			w.flush();
			//写一个字符数组
		   char[] c= {'a','b'};
		   w.write(c);
		   w.flush();
		   //写字符数组一部分
		   w.write(c, 0, 1);
		   w.flush();	   
//		   w.close();包含了flush		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
