package com.banyuan.test1;

import java.util.LinkedList;

public class Test {
public static void main(String[] args) {
	LinkedList<Person> ll=new LinkedList<Person>();//加上泛型就不会有警告
	ll.add(null);
	ll.add(new Person("zs",20));
	System.out.println(ll);//LinkedList,ArrayList都可以放null
	
}
}
