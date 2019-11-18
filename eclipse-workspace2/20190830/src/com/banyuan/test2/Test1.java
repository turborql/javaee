package com.banyuan.test2;

public class Test1 {
public static void main(String[] args) {
	MyThread mt=new MyThread(true);
	mt.start();
	MyThread mt2=new MyThread(false);
	mt2.start();
}
}
