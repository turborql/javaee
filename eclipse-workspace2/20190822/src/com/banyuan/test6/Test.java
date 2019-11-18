package com.banyuan.test6;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
	//在创建一个TreeSet集合的时候，将排序器放入
		TreeSet ts=new TreeSet(new Mycomparator());
		Student s1=new Student("zhangsan",100);
		Student s2=new Student("lisi",99);
		Student s3=new Student("wangwu",99);
		Student s4=new Student("zhaoliu",100);
		
		System.out.println("---");
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		System.out.println(ts);
	}

}
