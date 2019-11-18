package com.banyuan.test5;
//boolean的构造方法
public class MyThread extends Thread{

public MyThread(ThreadGroup tg, String name) {
	
}
//run里面造一个线程
public void run() {
	System.out.println(Thread.currentThread());
	MyThread2 mt2=new MyThread2();
	mt2.start();
}
}
