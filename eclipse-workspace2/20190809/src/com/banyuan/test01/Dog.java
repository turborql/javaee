package com.banyuan.test01;

public class Dog {

	public int age = 9;// 放下面也OK
	// static类所拥有，可以使用类名访问（不考虑访问修饰符）
	// 不加static是对象所拥有的，必须先创建对象，才可以使用
	public static String sex;//先

//构造方法不可能加静态static
	public Dog() {
		System.out.println(age);//后）
		System.out.println(sex);//（后的可以使用用先的sex)
	}

	public Dog(int age) {
		this.age = age;// this本类对象
	}
}
