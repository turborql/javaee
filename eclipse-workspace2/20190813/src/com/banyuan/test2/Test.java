package com.banyuan.test2;

public class Test {
public static void main(String[] args) {
	Person p=new Person("xiawa");
	Animal a=new Cat();
	Animal b=new Dog();
	p.feed(a);
	p.feed(b);
}
}
