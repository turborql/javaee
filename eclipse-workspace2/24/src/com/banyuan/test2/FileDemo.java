package com.banyuan.test2;

import java.io.File;

public class FileDemo {
public static void main(String[] args) {
	function1();//./a/c
	function2("c","a.txt");//c/a.txt
	function2("d","a.txt");//d/a.txt
	function3();//e/hello.java
}
/*1.File(String pathname)通过将给定路径名字字符串转化为抽象路径名来创建一个新File实例
    参数：String pathname：字符串的路径名称
    可以以文件夹结尾，可以以文件结尾
    路径可以是相对路径，也可以是绝对路径
    路径可以是存在的，也可以是不存在的
    将路径封装成File类型对象*/
//构造方法不管这个路径是否真的存在，只创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
public static void function1() {
	File f1=new File("./a/c");
	System.out.println(f1);//(File重写了Object的toString)
}
/*2.File(String parent,String child)根据parent路径名字符串转换为抽象路径名来创建一个新File实例
参数：把路径分成了两部分
string parent:父路径          String child：子路径
好处可以单独操作父路径和子路径
 * */
public static void function2(String parent,String child) {
	File f2=new File(parent,child);
	System.out.println(f2);
}
/*3.File(File parent, String child)
传递File类型父路径，字符串子路径
好处父路径是File类型，父路径可以直接调用File类方法*/
public static void function3() {
	File parent=new File("e");//创建一个父路径
	File file=new File(parent,"hello.java");
	System.out.println(file);
	
}
}
