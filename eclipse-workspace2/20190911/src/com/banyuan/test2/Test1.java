package com.banyuan.test2;

public class Test1 {
      public static void main(String[] args) {
		//2个线程（一个线程+1，一个线程-1）（消费者问题）
    	 Shop sunning=new Shop();
    	 MyThread mt1=new MyThread("进货",sunning);
    	 MyThread mt2=new MyThread("出货",sunning);
    	 mt1.start();
    	 mt2.start();
	}
}
