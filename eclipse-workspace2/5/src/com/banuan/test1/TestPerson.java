package com.banuan.test1;

public class TestPerson {
	public static void main(String[] args) {
//		Person p=new Person(new Car());
//		System.out.println(p);
		int a=1;
		function(a);
		System.out.println(a);
		Person p=new Person();
		p.name="zhangshan";
		System.out.println(p.name);
	}
	public static void function1(Person p) {
		p.name="lisi";
	}
	public static void function(int a) {
		a+=5;
	}
}
