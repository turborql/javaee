package com.banyuan.test4;

public class Test {
public static void main(String[] args) {
	MyThread mt=new MyThread();
	Thread t=new Thread(mt);
	t.start();
}
}
