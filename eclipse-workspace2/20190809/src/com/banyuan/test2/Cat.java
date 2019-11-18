package com.banyuan.test2;

public class Cat {
	private String name;
	private int age;
	private String color;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if(age>0 && age<20) {
			this.age=age;
		}else {
			System.out.println(1);
		}
		
	}
	public int getAge() {
		return age;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
}
