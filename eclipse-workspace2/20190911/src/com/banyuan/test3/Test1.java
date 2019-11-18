package com.banyuan.test3;

public class Test1 {
	public static void main(String[] args) {
		// 4个线程（2个 +1 不能超过10；2个 -1 不能到负数）
		Shop shop=new Shop();
		Thread mt1=new MyThread("进货1",shop);
		Thread mt2=new MyThread("进货2",shop);
		Thread mt3=new MyThread("出货1",shop);
		Thread mt4=new MyThread("出货2",shop);
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
	}
}
