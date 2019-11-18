package com.banyuan.test4;

public class TestEquals {
public static void main(String[] args) {
	Person p1=new Person("lisi",45);
	Person p2=new Person("zhangsan",30);
	boolean b=p1.equals(p2);
	System.out.println(b);
}
}
