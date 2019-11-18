package com.banyuan.test2;
/*字节输入流一次读取多个字节的方法：
 * int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
 *明确两件事：
 *1.方法参数byte[]的作用？
 *起到缓冲作用，存储每次读取到的多个字节
 *数组的长度一般定义为1024（1kb)或者1024的倍数
 *2.方法的返回值int是什么？
 *每次读取的有效字节个数
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo2 {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("a");
	/*byte[] b=new byte[2];
	int len=fis.read(b);
	System.out.println(len);
	System.out.println(Arrays.toString(b));
	System.out.println(new String(b));*/
//	System.out.println(new String(b,0,1));
//	String 类的构造方法
	//String(byte[] bytes)：把字节数组转换为字符串
	//String(byte[] bytes,int offset,int length)把字节数组的一部分转化诶字符串，offset数组的开始索引；length转换的字节个数
   byte[] bytes=new byte[1024];
   int len=0;
   while((len=fis.read(bytes))!=-1) {
	   System.out.println(new String(bytes,0,len));
   }
   
	fis.close();
   
   
}
}
