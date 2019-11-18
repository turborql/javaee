package com.banyuan.test2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
public static void main(String[] args) {
	//读取的方法：read()
	//int read()读取1个字符
	//int read(char[] c)读取字符数组
	//没有读字符串
	Reader r=null;
	try {
		 r=new FileReader("1");
		int len=0;
//		int read()读取1个字符
		while((len=r.read())!=-1) {
			System.out.println((char)len);
		}
//		int read(char[] c)读取字符数组
		char[] c=new char[1024];
		while((len=r.read(c))!=-1) {
			System.out.println(new String(c,0,len));//字符数组转字符串
		}
	} catch (FileNotFoundException e) {
				e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
}
