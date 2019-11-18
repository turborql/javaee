package com.banyuan.test2;

import java.io.File;

public class FileDemo2 {
public static void main(String[] args) {
	function1();///Users/edz/eclipse-workspace2/24/e/c/d/a.txt
	function2() ;//c/d/a/a.txt
	function3();
	function4();
}
	/*1.public String getAbsolutePath():返回此File的绝对路径名字符串
	 * 获取的是构造方法中传进来的路径
	 * 无论是相对的还是绝对的，getAbsolutePath方法返回的都是绝对路径
	 * 在eclipse环境中，File写的是一个相对路径，返回的绝对位置是工程根目录
	 * */
	public static void function1() {
		File f1=new File("e/c/d/a.txt");
		String AbsolutePath1=f1.getAbsolutePath();
		System.out.println(AbsolutePath1);	
	}
	/*2.public String getPath()：将此File转换为路径名字符串
	 * 获取的是构造方法中传递的路径
	 * 
	 * File的toString，实际调用的就是getPath()
	 * 源码：
	 * public String toString() {
        return getPath();}
	 * */
	public static void function2() {
		File f2=new File("c/d/a/a.txt");
		String path1=f2.getPath();
		System.out.println(path1);	
		System.out.println(f2.toString());
	}
	
	/*3.public String getName()：返回由此File表示的文件或目录的名称
	 * 获取的就是构造犯法传递路径的结尾部分（文件或文件夹）
	 * */
	public static void function3() {
		File f3=new File("c/d/a/a.txt");
		String name1=f3.getName();
		System.out.println(name1);//a.txt
		
		
		File f=new File("c/d/a");
		String name2=f.getName();
		System.out.println(name2);//a
	}
	/*4.public long length()：返回由此File表示的文件的大小
	 * 获取的是构造方法指定文件的大小，以字节为单位.返回路径中表示的文件的字节数
	 * 注意：
	 * 文件夹是没有大小概念的，不能获取文件夹的大小
	 * 如果构造方法中给出的路径不存在，那么length方法返回0
	 * */
	public static void function4() {
		File f3=new File("c/d/a/a.txt");
		long l1=f3.length();
		System.out.println(l1);//0
		
	}
	
}
/*5.File getAbsolutePath()
获取父路径,没有的话返回null
6.String getParent()
7.File getParentFile()*/
