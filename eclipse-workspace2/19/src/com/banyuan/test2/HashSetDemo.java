package com.banyuan.test2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
public static void main(String[] args) {
	Set<String> set=new HashSet<String>();
	set.add("cn");
	set.add("ef");
	set.add("cd");
	set.add("a");
	System.out.println(set);
	//遍历方法1
	Iterator it=set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("=========");
	//遍历方法2
	for(String s:set) {
		System.out.println(s);
	}
}
}
