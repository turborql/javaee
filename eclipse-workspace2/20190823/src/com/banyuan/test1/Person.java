package com.banyuan.test1;

public class Person {
private int id;
private String name;
private int score;

public Person(int id,String name,int score) {
	// TODO Auto-generated constructor stub
	this.id=id;
	this.name=name;
	this.score=score;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", score=" + score + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
}
