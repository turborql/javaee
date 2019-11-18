package cmo.banyuan.test4;
//1. 创建一个Runnable接口的实现类
public class RunnableDemo implements Runnable{
	@Override
	//2.在实现类中重写Runnable的run方法，设置线程任务
	public void run() {	
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}
