package com.banyuan.test2;

public class Shop {
private int goodsNumber;
//经销商进货//this
public synchronized void buy() {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	//货存数量=1.进货线程要等待，出货线程要唤醒
if(goodsNumber>0) {
	try {
		notify();
		wait();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}else {
			goodsNumber++;
			System.out.println(Thread.currentThread().getName() + "-->" + goodsNumber);
	
}

}
//经销商卖货
public synchronized void sell() {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	//货存数量=1，出货线程正常运行，但如果此时数量=0，出货线程要等待，进货线程要唤醒
    if(goodsNumber>0) {	
    	goodsNumber--;
    	System.out.println(Thread.currentThread().getName()+"-->"+goodsNumber);
    }else {
    	notify();
    	try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
}
