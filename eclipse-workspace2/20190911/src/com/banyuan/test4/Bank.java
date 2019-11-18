package com.banyuan.test4;

import java.util.Random;

import javax.swing.JTextArea;

public class Bank {
	private int moneyA = 500;
	private int moneyB = 500;
	private JTextArea jta_a;
	private JTextArea jta_b;
	private boolean flag=true;

	public Bank(JTextArea jta_a, JTextArea jta_b,boolean flag ) {
		this.jta_a = jta_a;
		this.jta_b = jta_b;
		this.flag=flag;
	}
	
	public void setFlag(boolean flag) {
		this.flag=flag;
	}

	// A-->B

	public synchronized void giveMoneyAb() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (flag) {
			if (moneyA > 0) {
				Random r = new Random();
				int money = r.nextInt(moneyA + 1);
				moneyA -= money;
				moneyB += money;
				jta_a.append("A->B转了" + money + "元。moneyA" + moneyA + "\n");
				jta_b.append("A->B转了" + money + "元。moneyB" + moneyB + "\n");
//			System.out.println("moneyA="+moneyA+",moneyB="+moneyB+",A->B转了"+money);
			} else {
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
	// B-->A

	public synchronized void giveMoneyBa() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (flag) {
			if (moneyB > 0) {

				Random r = new Random();
				int money = r.nextInt(moneyB + 1);
				moneyA += money;
				moneyB -= money;

				jta_a.append("B->A转了" + money + "元。moneyA" + moneyA + "\n");
				jta_b.append("B->A转了" + money + "元。moneyB" + moneyB + "\n");
//			System.out.println("moneyA="+moneyA+",moneyB="+moneyB+",B->A转了"+money);
			} else {
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
}