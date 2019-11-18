package cmo.banyuan.cn;
//1.创建一个Thread类的子类
public class MyThread extends Thread{
//	2.在Thread类的子类中重写Thread类中的run方法，设置线程任务
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("run"+i);
		}
	}
}
/*
 * 构造方法：
 * public Thread()分配一个新的线程对象
 * public Thread(String name)分配一个带有指定名字的新的线程对象
 * public Thread(Runnable target)
 * public Thread(Runable target,String name)
 * 常用方法：
 * public String getName()获取当前线程名称
 * public void start()
 * public void run()此线程要执行的任务在此处定义代码
 * public static void sleep(long millis)使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）
 * public static Thread currentThread()返回对当前正在执行的线程对象的引用
 */
