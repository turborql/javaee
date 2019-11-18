package com.banyuan.test2;

import java.io.File;

public class FielDemo3 {
public static void main(String[] args) {
	function1();//false
	function2();
}
/*1.public boolean exists();此File表示的文件或目录是否实际存在
 * 用于判断构造方法中的路径是否存在
 * 存在：true
 * 不存在：false
 * */
public static void function1() {
	File f=new File("c");
	System.out.println(f.exists());
}
/*2.public boolean isDirectory();//此File表示的是否为目录
 * 用于判断构造方法中给定的路径是否以文件夹结尾
 * 存在：true
 * 不存在：false
 * */


/*3.public boolean isFile();//此File表示的是否为文件
 * 用于判断构造方法中给定的路径是否以文件结尾
 * 存在：true
 * 不存在：false
 * */

//注意电脑的硬盘中只有文件和文件夹，两个方法海思互斥的
//这两个方法使用前提，路径是必须存在的，否则都返回false

public static void function2() {
	File f=new File("c");
	if(f.exists()) {
		System.out.println(f.isDirectory());//true
		System.out.println(f.isFile());//false
	}
}
}

