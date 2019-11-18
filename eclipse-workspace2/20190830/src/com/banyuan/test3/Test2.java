package com.banyuan.test3;

public class Test2 {
public static void main(String[] args) {
	RunDemo t1=new RunDemo();
	Thread t=new Thread(t1);
	t.start();
}
}
