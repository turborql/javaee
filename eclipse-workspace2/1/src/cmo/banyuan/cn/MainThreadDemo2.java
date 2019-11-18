package cmo.banyuan.cn;
//创建Thread类的子类
public class MainThreadDemo2  {
public static void main(String[] args) {
	//3.创建Thread类的子类对象
	MyThread mt=new MyThread();
	//4.调用Thread类中的方法start方法，开启新的线程，执行run方法
    //void start（）使该线程开始执行，Java虚拟机调用该线程的run方法
	//结果是两个线程并发地运行，当前线程（main）和另一个线程（创建的新线程，执行其run方法）。
	//多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
	//java程序属于抢占式调度，哪个线程的优先级高，就选择哪个
	mt.start();
	for(int i=0;i<10;i++) {
		System.out.println("mian"+i);
	}
}
}
