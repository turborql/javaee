package com.banyuan.test1;

import java.io.File;

public class FileDemo4 {
public static void main(String[] args) {
	function();
	function2();
}
//File判断功能
//boolean exists()
//判断Fie构造方法中封装的路径是否存在
//存在返回true，不存在返回false
public static void function() {
	File file=new File("b");
	boolean b=file.exists();
	System.out.println(b);
}

//File类判断功能
//boolean isDirectory()
//判断File构造方法中封装的路径是不是文件夹
//如果是文件夹返回true，没有返回false
public static void function2() {
	File file=new File("e");
	if(file.exists()) {
		boolean b=file.isDirectory();
		System.out.println(b);
	}
}
//File类判断功能
//boolean isFile()
//判断File构造方法中封装的路径是不是文件
//如果是文件返回true，没有返回false
}
