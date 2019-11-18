package com.banyuan.test;

public class Person {
private static Person instance;
//=new Person();
//	private static Person instance;
//线程安全的单例
public static Person getInstance() {
	//为什么不能用this
	synchronized(Person.class){
	if(instance==null) {
		instance=new Person();
	}
	
	return instance;
}
}
private Person() {
}
}