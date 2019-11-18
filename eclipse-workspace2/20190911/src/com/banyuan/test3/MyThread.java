package com.banyuan.test3;

public class MyThread extends Thread {
	private Shop shop;

	public MyThread(String name, Shop shop) {
		super(name);
		this.shop = shop;
	}

	public void run() {
		while (true) {
			if (getName().contains("进货")) {
				shop.buygoods();

			} else {
				shop.sellgoods();

			}
		}

	}

}
