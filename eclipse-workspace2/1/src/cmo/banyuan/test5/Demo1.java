package cmo.banyuan.test5;

public class Demo1 {
public static void main(String[] args) {
	Object obj =new Object();
	RunnableImp run=new RunnableImp(obj);
	Thread t0=new Thread(run,"0");
	Thread t1=new Thread(run,"1");
	Thread t2=new Thread(run,"2");
	t0.start();
	t1.start();
	t2.start();
}
}
