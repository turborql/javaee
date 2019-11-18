package com.banyuan.test1;

import java.io.File;

//File类获取功能
//list
//listFiles
public class FileDemo5 {
public static void main(String[] args) {
	function();
}
//1.String[] list()
//获取到File构造方法中封装到路径中到文件和文件夹名（遍历一个目录）
//返回只有一个名字
public static void function() {
	File file=new File("b");
	String[] strArr=file.list();
	System.out.println(strArr.length);
	for(String s:strArr) {
		System.out.println(s);	
	}
}
//File[] listFiles()
//获取到File构造方法中封装到路径中到文件和文件夹名（遍历一个目录）
//返回目录或文件的全路径
}
