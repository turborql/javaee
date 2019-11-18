package com.banyuan.test3;

import java.io.Serializable;
//自定义类必须实现Serializable接口
public class Person implements Serializable{
@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
private String name;
private   int age;

private static final long serialVersionUID = 1L;
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
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

}
