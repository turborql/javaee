package cmo.banyuan.test5.copy.copy.copy;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImp implements Runnable {
	private static int ticket = 100;
//1.在成员位置创建一个ReentrantLock对象
	Lock l=new ReentrantLock();
	public void run() {
//Object
		while (true) {
			//2\在可能会出现安全问题的代码前调用lock接口中的方法lock获取锁
			l.lock();
			if (ticket > 0) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票");
					ticket--;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					//3.在可能会出现安全问题的代码后调用lock接口中的方法unlock释放锁
					l.unlock();
					
				}
				
			}
		}

	}
	
		
	
}
