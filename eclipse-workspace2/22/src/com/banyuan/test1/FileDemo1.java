package com.banyuan.test1;

import java.io.File;

//构造方法
public class FileDemo1 {
public static void main(String[] args) {
	function();
	function1();
	function2();
}
public static void function() {
	//1.File(String pathname)传递路径名：可以写到文件夹，可以写到一个文件
	//将路径封装成File类型对象
	File file=new File("./FileDmeo");//构造方法不管这个路径是否真的存在，只是把路径名称变成File对象
//	File file=new File("d:\\eclipse");
	//boolean exists()判断路径表示的文件或文件夹是否真的存在
	System.out.println(file);//file重写了toString
}
public static void function1() {
//	2.File(String name,String child)//  传递字符串父路径，字符串子路径（好处可以单独操作父路径和子路径）
	File file=new File("d:","eclipse");
}
public static void function2() {
//	3.File(File parent, String child)//传递File类型父路径，字符串子路径（好处父路径是File类型，父路径可以直接调用File类方法）
	File parent =new File("d:");
	File file=new File(parent,"eclipse");
	System.out.println(file);
}
}









/*
 * Constructor and Description
File(File parent, String child)
创建从一个家长的抽象路径名和一个孩子的路径字符串的新 File实例。
File(String pathname)
通过将给定的路径名的字符串转换成一个抽象路径名创建一个新的 File实例。
File(String parent, String child)
创建从父路径名的字符串和一个孩子的一个新的 File实例文件。
File(URI uri)
通过将给定的 file: URI到一个抽象路径名创建一个新的 File实例。

 * */
