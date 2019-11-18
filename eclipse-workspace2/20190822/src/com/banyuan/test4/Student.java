package com.banyuan.test4;

public class Student {
	private String name;
//	private Integer age;
	private int age;
	private int score;

	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
//		return super.hashCode();
		return name.hashCode() ;
		
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		Student s = (Student) obj;
//		return this.name.equals(s.name) && this.age.equals(s.age);
//		return this.name.equals(s.name) && this.age==(s.age);
		return this.age==(s.age);
	}
}
