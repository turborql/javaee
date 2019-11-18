package cmo.banyuan.test2;

public class GetThreadName {
public static void main(String[] args) {
	MyThread mt=new MyThread();
	mt.start();
	new MyThread().start();
	System.out.println(Thread.currentThread().getName());
}
}
