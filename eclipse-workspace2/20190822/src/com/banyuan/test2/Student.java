package com.banyuan.test2;

public class Student {
private String name;
private int score;
private int age;
public Student(String name, int score, int age) {
	super();
	this.name = name;
	this.score = score;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "[name=" + name + ", score=" + score + ", age=" + age + "]";
}
@Override
public int hashCode() {
	System.out.println("=====1=====");
	return 0;
}
@Override
public boolean equals(Object obj) {
	System.out.println("*****2*****");
	return true;
	}

}
