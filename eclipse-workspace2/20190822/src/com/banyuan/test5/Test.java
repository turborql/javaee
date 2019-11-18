package com.banyuan.test5;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add("hello");
		System.out.println(ts);
		ts.add("world");
		System.out.println(ts);
		ts.add("china");
		System.out.println(ts);
		ts.add("abc");
		System.out.println(ts);
		ts.add("abc");
		System.out.println(ts);
	}
}
