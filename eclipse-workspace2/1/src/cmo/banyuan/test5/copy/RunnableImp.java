package cmo.banyuan.test5.copy;

public class RunnableImp implements Runnable {
	private int ticket = 100;
//创建一个锁对象(注意要放在run方法外面)
	Object obj = new Object();

	public void run() {
		// 同步方法

		while (true) {
			payTicket();
		}

	}

	public synchronized void payTicket() {
		if (ticket > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票");
			ticket--;
		}
	}
}
