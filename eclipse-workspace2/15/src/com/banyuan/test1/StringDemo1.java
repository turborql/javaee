package com.banyuan.test1;

public class StringDemo1 {
public static void main(String[] args) {
	//字符串的定义方法：1、直接=；2、使用String的构造方法
	String str1=new String("abc");
	String str2="abc";
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str1==str2);
	System.out.println(str1.equals(str2));
}
}
