package com.banyuan.test1;

public class Person {
	private int age;
	private String name;
	public Person(int age,String name) {
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name+age;
	}

}
