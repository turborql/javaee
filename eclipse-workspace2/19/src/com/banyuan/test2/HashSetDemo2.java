package com.banyuan.test2;

import java.util.HashSet;

public class HashSetDemo2 {
public static void main(String[] args) {
	HashSet<String> set=new HashSet<String>();
	set.add(new String("abc"));
	set.add(new String("abc"));
	set.add(new String("bbc"));
	set.add(new String("bbc"));
	System.out.println(set);
	
	//将Person对象中的姓名，年龄相同的，看作同一个对象
	//判断对象是否重复
	HashSet<Person> setPerson=new HashSet<Person>();
	setPerson.add(new Person("a",12));
	setPerson.add(new Person("b",15));
	setPerson.add(new Person("c",16));
	setPerson.add(new Person("c",16));
	System.out.println(setPerson);

}
}
