package com.banyuan.test;

import java.util.ArrayList;
import java.util.Collection;

public class test1 {
	public static void main(String[] args) {
		Collection cl = new ArrayList();
		System.out.println("集合中是否有为空" + cl.isEmpty());// 集合中是否有为空true
		// 1.增
		cl.add("hello");// Object obj="hello";
		cl.add(123);// 先自动装箱，然后转Object , Object obj=123;
		Person p = new Person(18);
		cl.add(p);
		System.out.println("集合中是否有为空" + cl.isEmpty());// 集合中是否有为空false
		System.out.println("集合中有几个元素" + cl.size());// 集合中有几个元素2
		System.out.println(cl);
	}
}
