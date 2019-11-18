package com.banyuan.test2;

public class MyThread extends Thread {
	Shop shop;
//	private boolean flag;//true:buy
	
	public MyThread(String name,Shop shop) {
		super(name);
//		this.flag=flag;
		this.shop=shop;
	}
	
@Override
public void run() {
	
	while(true) {
		
		if("进货".equals(getName())) {//why
			
				shop.buy();
			
		}else {
			shop.sell();
		}
	}
	
}

}
