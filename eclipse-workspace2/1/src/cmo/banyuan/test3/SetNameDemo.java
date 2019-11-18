package cmo.banyuan.test3;
//创建一个带参数的构造方法，参数传递线程的名称。调用父类的代餐构造方法，把线程名称传递给父类，让父类（Thread）给子线程起一个名字
//Thread(String name)分配新的Thread对象
public class SetNameDemo {
public static void main(String[] args) {
	MyThread mt=new MyThread("旺财");
	mt.start();
	//new MyThread("旺财").start();
}
}
