package com.banyuan.test1;

public class Test1 {
public static void main(String[] args) {
//	MyThread mt=new MyThread();
	/*Thread t=new Thread() {
		public void run() {
			System.out.println("hello");
		}
	};
	t.start();*/
	
	/*Runnable r=new Runnable() {
		public void run(){
			System.out.println("hello1");
		}
	};
	Thread t=new Thread(r);
	t.start();*/
	
	Thread t=new Thread(()->{System.out.println("hello2");});
	t.start();
}
}
