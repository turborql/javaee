package com.banyuan.test6;

public class Test {
public static void main(String[] args) {
	System.out.println(Person.classname);
          Person p1=new Person();
          Person p2=new Person();
          p1.name="haha";
          p2.name="xixi";
          System.out.println(p1.name);
          System.out.println(p2.name);
          p1.classname="基础班";
          System.out.println(p2.classname);
}
}
