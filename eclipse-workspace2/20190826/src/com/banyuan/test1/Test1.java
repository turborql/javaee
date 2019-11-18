package com.banyuan.test1;

import java.util.ArrayList;
public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		System.out.println(al);	
		al.add("hello");
//		al.add(1);会报错
		System.out.println(al);
	}
}
