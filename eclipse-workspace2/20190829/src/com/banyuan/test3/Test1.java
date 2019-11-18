package com.banyuan.test3;

import java.io.File;
import java.io.IOException;
//File构造方法，看api
//类URI统一资源
//URL
public class Test1 {
public static void main(String[] args) {
//	File f=new File("e1");//不会创建file
	File f=new File("e3","e4");
	f.mkdirs();
	
	
//	f.mkdir();//可以创建文件夹
//	try {
//		f.createNewFile();//练习 
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	
}
}
