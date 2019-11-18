package com.banyuan.test5;

public class Test {

	public static void main(String[] args) {
		// Java中，对象的多态性，调用程序中的方法
		// 公式：父类类型或者接口类型 变量=new 子类的对象（）；
		Fu f = new Zi();
		f.show();
		
		//抽象类
		Animal a=new Cat();
		a.eat();
		
		//接口
		Smoking sk=new Student();
		sk.smoking();

	}

}
