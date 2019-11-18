package com.banyuan.test2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//文件复制练习：一读一写
public class Copy {
public static void main(String[] args) throws IOException {
	//1、创建一个字节输入流对象，构造方法中绑定要读取的数据源
	FileInputStream fis=new FileInputStream("‎⁨1.jpg");
	//2、创建一个字节输出流对象，构造方法中绑定要写入的目的地
	FileOutputStream fos=new FileOutputStream("‎⁨2⁩");
	//3、一次读取一个字节写入一个字节的方法
	//int len=0;
	//4、使用字节输出流中的write方法，把读到的字节写入到目的地的文件中
//    while((len=fis.read())!=-1) {
//    	fos.write(len);
//    }
	//使用数组缓冲读取多个字节，写入多个字节
	byte[] b=new byte[1024];
	int len=0;
	while((len=fis.read(b))!=-1) {
    	fos.write(b,0,len);
	}
	//5、释放资源(先关闭写的流)
    fos.close();
    fis.close();
}
}
