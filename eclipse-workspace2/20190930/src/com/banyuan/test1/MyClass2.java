package com.banyuan.test1;

public class MyClass2 implements MyInterface{
private MyInterface mi;
public MyClass2(MyInterface mi) {
	this.mi=mi;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("cosplay");
		mi.run();
		System.out.println("庆祝成功");
	}

}
