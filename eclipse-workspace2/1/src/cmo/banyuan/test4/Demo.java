package cmo.banyuan.test4;

public class Demo {
	public static void main(String[] args) {
//		3.创建一个Runnable实现类的对象
		RunnableDemo r = new RunnableDemo();
//		4.创建Thread类的对象，构造方法中传递Runnable接口的实现类对象
		Thread t = new Thread(r);
//		5.调用Thread类中的start方法，开启新的线程执行run方法
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "-->" + i);
		}
	}

}
