package com.banyuan.test2;

public class MyThread extends Thread{
private boolean flag;
	public MyThread(boolean flag) {
	this.flag=flag;
}
	public void run() {
		if(flag) {
			//循环打印ABC
			System.out.println("ABC");
		}else {
			System.out.println("abc");
		}
}
}
