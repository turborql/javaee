package com.banyuan.test1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

//OutputStreamWriter可以操作UTF-8
//OutputStreamWriter继承Writer类--可以将字符流转成字节流
//write()
/*
 * OutputStreamWriter（OutputStream out)接收所有的字节输出流
 * 字节输出流：FileOutputStream
 * OutputStreamWriter（OutputStream out,String charsetName)
 * String charsetName:编码表的名字GBK,UTF-8
 * */
public class OutputStreamWriterDemo {
public static void main(String[] args) {
	writeGBK();
	writerUTF();
}
//文本采用GBK的形式写入
public static void writeGBK() {
//	PrintStream ps=null;
//	PrintWriter pw=null;close不会抛异常
	try {
		//创建字节输出流
		FileOutputStream fs=new FileOutputStream("2");
		//创建转换流对象，构造方法中绑定字节输出流,使用GBK编码表,本机默认编码表
		OutputStreamWriter ow=new OutputStreamWriter(fs);
		//使用转换流写数据
		ow.write("你好");
		ow.close();//只关最外面的包装流就可以
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}
//转换流对象OutputStreamWriter写文本，采用UTF-8编码表
public static void writerUTF() {
	try {
		//创建字节输出流
		OutputStream os=new FileOutputStream("utf");
	//创建转换流对象，构造方法保证字节输出流，并指定编码表是UTF-8
		OutputStreamWriter ow=new OutputStreamWriter(os,"UTF-8");
		ow.write("你好");
		ow.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
