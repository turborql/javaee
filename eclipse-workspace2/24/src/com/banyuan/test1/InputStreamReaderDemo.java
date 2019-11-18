package com.banyuan.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//字节流转字符流
//read（）读取1个字符；读取字符数组
//InputStreamReaderDemo（InputStream in）
//InputStreamReaderDemo（InputStream in,String charsetName）
//FileInputStream读取文件
public class InputStreamReaderDemo {
 //读GBK
	public static void main(String[] args) {
		readGBK();
	}
	public static void readGBK() {
		try {
			//创建输入流，传递文本文件
			InputStream is=new FileInputStream("2");
//创建转换流对象，构造方法，包装字节输入流
			InputStreamReader ir=new InputStreamReader(is);
			char[] c=new char[1024];
			int len=ir.read(c);
			System.out.println(new String(c,0,len));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
