package com.banyuan.test;

public class MyThread extends Thread{
	public void run() {
		Person p1=Person.getInstance();
		System.out.println(Thread.currentThread().getName()+"p1="+p1);
		
	}
}
