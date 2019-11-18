package cmo.banyuan.test5.copy.copy.copy;

public class Demo1 {
public static void main(String[] args) {
	RunnableImp run=new RunnableImp();
	Thread t0=new Thread(run);
	Thread t1=new Thread(run);
	Thread t2=new Thread(run);
	t0.start();
	t1.start();
	t2.start();
}
}
