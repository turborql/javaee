package com.banyuan.test2;

public class Teacher extends Person{
	private String course;
	public Teacher(String name,int age,String sex,String course) {
		super(name,age,sex);
		this.course=course;		
		}
	public void print2() {
		print();
		System.out.print(",course"+course);
	}
}
