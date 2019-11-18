package com.banyuan.test4;

public class MyThread implements Runnable {
	
	private Bank bank;
	private String name;
	
	
	public MyThread(String name, Bank bank) {
		this.name=name;
		this.bank=bank;
		
	}

	public void run() {
		for(;;) {
			
			if("A".equals(name)) {
				bank.giveMoneyAb();
				
			}else {
				bank.giveMoneyBa();
				
			}
		}

	}
}