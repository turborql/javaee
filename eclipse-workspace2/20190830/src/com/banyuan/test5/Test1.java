package com.banyuan.test5;

public class Test1 {
public static void main(String[] args) {
	ThreadGroup tg=new ThreadGroup("线程组1");
	MyThread mt=new MyThread(tg,"thread1--");
	mt.start();
}
}
