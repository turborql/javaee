package cmo.banyuan.test5.copy.copy;

public class RunnableImp implements Runnable {
	private static int ticket = 100;

	public void run() {

		while (true) {
			payTicket();
		}

	}
//静态的同步方法
	//锁对象是谁？不能是this，this是创建对象之后产生的，静态方法优先于对象
	//静态方法的锁对象是本类的class属性--class文件对象（反射）
	public  static synchronized void payTicket() {
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
