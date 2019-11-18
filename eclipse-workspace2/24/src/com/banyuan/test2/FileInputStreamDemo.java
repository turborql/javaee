package com.banyuan.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("a");
//	int len=fis.read();
//	System.out.println(len);
//	
//	len=fis.read();
//	System.out.println(len);
//	
//	len=fis.read();
//	System.out.println(len);
//	
//	len=fis.read();
//	System.out.println(len);
//	
//	len=fis.read();
//	System.out.println(len);
//	
//	len=fis.read();
//	System.out.println(len);
//	
//	len=fis.read();
//	System.out.println(len);
//	
//	len=fis.read();
//	System.out.println(len);
//	
//	len=fis.read();
//	System.out.println(len);
//	
//	len=fis.read();
//	System.out.println(len);
	
	/*发现以上读取文件是一个重复的过程，所以可以使用循环优化
	 * 不知道文件中有多少个字节，使用while循环
	 * while循环结束条件，读取到-1的时候结束
	 * */
	int len=0;//记录读取到的字节
	while((len=fis.read())!=-1) {
		System.out.print((char)len);//将读到的字节强转为字符
	}
//	while(fis.read()!=-1) {
//		System.out.println(fis.read());
//	}错误写法，必须在外面定义一个变量接受读取的数据
	fis.close();
}
}
