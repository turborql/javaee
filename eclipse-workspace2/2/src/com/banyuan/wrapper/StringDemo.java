package com.banyuan.wrapper;

public class StringDemo {
public static void main(String[] args) {
	String s="abc";
	String s1=new String();
	
	byte[] b= {97,98,99,100};
	String s2=new String(b,0,4);
	
	char [] c= {'a','b','c'};
	String s3=new String(c,0,3);
	
	String s4=new String("abc");
	System.out.println("s2"+s2);
	System.out.println("s3"+s3);
}
}
