package com.banyuan.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {
public static void main(String[] args) {
	//定义两个流的对象
	try {
		OutputStream os=new FileOutputStream("a");//有就覆盖，没有就创建
		os.write("hello".getBytes());	//把字符串转成字节数组
		InputStream is=new FileInputStream("a");//读文件的内容	
		OutputStream os1=new FileOutputStream("c");//copy
		//读一个写一个
		int len;
		while((len=is.read())!=-1) {
			os1.write(len);
		}
	} catch (FileNotFoundException e) {	
		e.printStackTrace();
	} catch (IOException e) {	
		e.printStackTrace();
	}
}
}
