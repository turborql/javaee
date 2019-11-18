package com.banyuan.test4;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public void feed(Animal a) {
		System.out.println(name+"在喂");
		a.eat();
		
	}
}
