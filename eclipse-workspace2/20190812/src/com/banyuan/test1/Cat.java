package com.banyuan.test1;

public class Cat extends Animal{
	public  String name;
	public  int age=2;
	public String sex;
	
	public void print() {
		//超类（基类）引用super
		System.out.println(super.age+" "+age);
		
	}

}
