package com.banyuan.test5;
//第一种重写compareTo方法
public class Student implements Comparable{
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

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

//	@Override
//	public int hashCode() {
////		return super.hashCode();
//		return name.hashCode() ;
//		
//	}
//
//	@Override
//	public boolean equals(Object obj) {
////		return super.equals(obj);
//		Student s = (Student) obj;
////		return this.name.equals(s.name) && this.age.equals(s.age);
////		return this.name.equals(s.name) && this.age==(s.age);
//		return this.age==(s.age);
//	}


	public int compareTo(Object o) {
		System.out.println("Student compareTo=========");
		Student s=(Student)o;
		return  s.score-this.score;
		
	}
	
	
}
