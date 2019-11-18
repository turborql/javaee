package com.banyuan.test1;

import java.io.File;
import java.io.IOException;

//File类的创建和删除功能（文件和目录）
public class FielDemo2 {
public static void main(String[] args) {
	function();
	function1();
	function2();
}
public static void function() {
	//1.boolean createNewFile()
	//创建的文件路径和文件名是在File类的构造方法中给出的
	File file=new File("./e");
	File file1=new File("./a");
	System.out.println(file1);
	try {
		boolean b=file. createNewFile();//如果文件已经存在就返回false;并且只能创建文件，不能创建文件夹
		file1.createNewFile();
		System.out.println(b);
	} catch (IOException e) {
		e.printStackTrace();
	}	
}
//2. 创建一级文件夹=1
//boolean mkdir()
//创建的路径也在File构造方法中给出
//如果已经存在文件夹，就不再创建
public static void function1() {
	File file=new File("./b");
	boolean b=file.mkdir();
	System.out.println(b);
}
//创建多级文件夹>=1
//boolean mkdirs()
public static void function2() {
	File file=new File("./b/c/d");
	file.mkdirs();
}

}
