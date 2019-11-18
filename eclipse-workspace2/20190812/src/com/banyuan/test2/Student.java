package com.banyuan.test2;

public class Student extends Person {
	private String major;
	public Student(String name,int age,String sex,String major) {
		super(name,age,sex);
		this.major=major;
	}
	public void print2() {
//		super.print();
		print();
		System.out.print(",major"+major);
		
	}
}
