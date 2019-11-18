package com.banyuan.test;

import java.lang.reflect.Constructor;

public class Test1 {
public static void main(String[] args) {
	Class c = null;
	try {
		c = Class.forName("com.banyuan.test.Person");
		Constructor[] cons=c.getConstructors();
		for(Constructor c1:cons) {
			System.out.println(c1);
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	Constructor[] cons=c.getConstructors();
	for(Constructor c1:cons) {
		System.out.println(c1);
	}
	
}
	
	
}
