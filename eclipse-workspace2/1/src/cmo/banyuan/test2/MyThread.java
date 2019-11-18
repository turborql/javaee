package cmo.banyuan.test2;
//获取线程的名称
public class MyThread extends Thread{
@Override
public void run() {
//	1.使用Thread类中的方法getName（）
// String name=getName();
//    System.out.println(name);
	//2.可以先获取到当前正在执行的线程，使用线程中的方法getName（）获取线程的名称
//	static Thread currentThread()返回对当前正在执行的线程对象的引用
//    Thread t=Thread.currentThread();
//    System.out.println(t); 
//    String name=t.getName();
//    System.out.println(name);
//	链式编程
//	System.out.println(Thread.currentThread().getName());
}
}
