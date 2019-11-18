package com.banyuan.test;

public class Person {
	private int age;
	private String name;

	protected Person() {
		System.out.println("=====protected Person()========");
	}
	
	public Person(int age) {
		System.out.println(age);
	}
	private void run(int age) {
		System.out.println("=======run()==="+age);
	}

	public void jump() {
		System.out.println("====jump()=====");
	}
	private Person(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("==Person(String name,int age)==");
	}

}
