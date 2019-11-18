package com.banyuan.test3;

import java.util.HashSet;

public class Test2 {

	public static void main(String[] args) {
		Student s1=new Student("zhangsan",100);
		Student s2=new Student("lisi",99);
		Student s3=new Student("zhangsan",90);
		HashSet hs=new HashSet();
		System.out.println("---------------");
		//add调用了hashCode和equals方法（两个都是Object类的，但是这里Student重写了这两个方法）
		hs.add(s1);
		System.out.println("--------1-------");
//		System.out.println(hs);
		hs.add(s2);
		System.out.println("--------2-------");
//		System.out.println(hs);
		hs.add(s3);
		System.out.println("--------3-------");
		System.out.println(hs);
		
 	
	}

}
