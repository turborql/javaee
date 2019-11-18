package com.banyuan.test6;

public class Student {
	static String name;
	int age;
	public static void main(String[] args) {
		new Student().function();
	}
	
	
	public  void function() {
		System.out.println(name + age);
	}

}
