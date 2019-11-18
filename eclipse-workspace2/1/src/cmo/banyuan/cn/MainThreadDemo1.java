package cmo.banyuan.cn;

public class MainThreadDemo1 {
public static void main(String[] args) {
	/*主线程：执行main（主）方法的线程
	 * 单线程程序：Java程序中只有一个线程
	 * 执行从main方法开始，从上到下一次执行
	 * */
	Person p1=new Person("小强");
	p1.run();
	System.out.println(0/0);
	Person p2=new Person("旺财");
	p2.run();
}
}
