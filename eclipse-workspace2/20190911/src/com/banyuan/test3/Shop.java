package com.banyuan.test3;

public class Shop {
	private int goodsNumber;

	public int getgoodsNumber() {
		return goodsNumber;
	}

	public void setgoodsNumber(int goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	// 进货
	public synchronized void buygoods() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
      if(goodsNumber>9) {
    	  notifyAll();
    	  try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      }else {
    	  goodsNumber++;
    	  System.out.println(Thread.currentThread().getName()+"===="+goodsNumber);
      }
	}

   //卖货
	public synchronized void sellgoods() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(goodsNumber>0) {
			goodsNumber--;
			System.out.println(Thread.currentThread().getName()+"===="+goodsNumber);
		}else {
			try {
				 notifyAll();
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
