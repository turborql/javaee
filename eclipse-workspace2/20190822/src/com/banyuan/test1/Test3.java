package com.banyuan.test1;

import java.util.Arrays;

public class Test3 {
public static void main(String... args) {//不懂
//	int [] a= {99,60,100};//无序
//	Arrays.sort(a);
//	for(int i:a) {
//		System.out.println(i);
//	}//升序
//	//降序
	Person p1=new Person(12,"zhangsan");
	Person p2=new Person(15,"lisi");
	Person[] p= {p1,p2};
	PersonComparator pc=new  PersonComparator();
	Arrays.sort(p);
	
	
	
	for(Person person: p) {
		
		System.out.println(person);
	}
	
	
	
}
}
