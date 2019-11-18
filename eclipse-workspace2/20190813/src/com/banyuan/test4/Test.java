package com.banyuan.test4;

public class Test {

	public static void main(String[] args) {
		Person p=new Person("肖战");
		Animal a1=new Dog();
		Animal a2=new Rabbit();
		p.feed(a1);
		p.feed(a2);
	}

}
