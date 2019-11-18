package com.banyuan.test1;
/*String:
 * 一切都是对象，字符串事物“”也是对象
 * 类是描述事物，String类，描述字符串对象的类
 * 所有的“”都是String类的对象
 * 字符串是一个常量，一旦创建不可更改
 * */

public class StringDemo {
	public static void main(String[] args) {
		//实际是变量str的指向内存变了，而定义好的字符串对象是不变的
		String str="itcast";
		System.out.println(str);
		str="ithema";
	}

}
