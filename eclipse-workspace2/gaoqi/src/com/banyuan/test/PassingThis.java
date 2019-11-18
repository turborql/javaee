package com.banyuan.test;

public class PassingThis {
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}
}
//class Peeler{
//	static Apple peel(Apple apple) {
//		return apple;
//	}
//}
class Apple{
//	Apple getPeeled() {
//		return Peeler.peel(this);
//	}
}
class Person{
public void eat(Apple apple) {
	System.out.println("yummy");
}
}
