package cmo.banyuan.test1;

public class TestMethod {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	//System.out.println(t);
	System.out.println(t.toString());//重写了toString
	ThreadGroup tg=new ThreadGroup("自定义线程组");//lang包下的，不需要import
	MyRunnable my=new MyRunnable();//创建一个线程类的对象
	Thread tt=new Thread(tg,my);//将my放到tg这个线程组中
	System.out.println(tt.toString());
	//获取线程的名称
	System.out.println(t.getName());
	System.out.println(tt.getName());
}
}
