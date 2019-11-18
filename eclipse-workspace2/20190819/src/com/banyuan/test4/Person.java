package com.banyuan.test4;

public class Person {
private String name;
private int age;
private int score;
public void setScore(int score) {
	this.score=score;
}
public int getScore() {
	return score;
}
public Person() {
	
}
public void  setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setAge(int age) {
	this.age=age;
}
public int getAge() {
	return age;
}

public void print() {
	System.out.println("name="+name+ ",age"+age);
}
}
