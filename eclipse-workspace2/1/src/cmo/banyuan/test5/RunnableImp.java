package cmo.banyuan.test5;

/*
 * synchronized(锁对象){
 * 可能会出现线程安全问题的代码（访问了共享数据的代码）
 * }
 * 注意
 * 1.通过代码块中的锁对象，可以使用任意的对象
 * 2.但是必须保证对多个线程使用的锁对象是同一个
 * 3.锁对象的作用：把同步代码块锁住，让一个线程在同步代码块中执行
 */
public class RunnableImp implements Runnable {
	private int ticket = 100;
	private Object obj;
//创建一个锁对象(注意要放在run方法外面)

	public RunnableImp(Object obj) {
		this.obj = obj;
	}

	public void run() {
		// 同步代码块

		while (true) {
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (obj) {
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票");
					ticket--;
				}
			}

		}

	}
}
