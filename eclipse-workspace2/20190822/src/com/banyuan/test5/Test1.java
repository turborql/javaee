package com.banyuan.test5;

import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		Student s1 = new Student("zhangsan", 18, 90);
		ts.add(s1);
		System.out.println("====1=====");
		System.out.println(ts);
		Student s2 = new Student("lisi", 18, 89);
		ts.add(s2);
		System.out.println("====2=====");
		System.out.println(ts);
		Student s3 = new Student("zhaoliu", 18, 90);
		ts.add(s3);
		System.out.println("====3=====");
		System.out.println(ts);
	}

}
