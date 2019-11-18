package com.banyuan.test2;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student("zhangsan",99,12);
		Student s2=new Student("lisi",90,15);
		Student s3=new Student("zhangsan",90,12);
		Student s4=new Student("zhangsan",98,15);
		HashSet hs=new HashSet();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		System.out.println(hs);

	}

}
