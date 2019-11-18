package com.banyuan.test;

public class Test1 {
public static void main(String[] args) {
//	Person p1=Person.getInstance();
//	System.out.println("p1="+p1);
//	
//	Person p2=Person.getInstance();
//	System.out.println("p2="+p2);
	
	MyThread mt=new MyThread();
	mt.start();
	
	MyThread mt1=new MyThread();
	mt1.start();
}
	
}
