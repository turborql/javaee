package com.banyuan.wrapper;

public class IntegerDemo1 {
public static void main(String[] args) {
	Integer i=Integer.valueOf(12);
	System.out.println(i);
	int a=i.intValue();
	System.out.println(a);
	
	String s=i.toString();
	System.out.println(s);
	Integer i2=Integer.valueOf("123");
	System.out.println(i2);
	
	int b=Integer.parseInt("123");
	
	String.valueOf(b);
}
}
