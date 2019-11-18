package com.banyuan.test4;

import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
      Student s1=new Student("zhangsan",18,99);
      Student s2=new Student("lisi",20,89);
      Student s3=new Student("zhaoliu",22,90);
      Student s4=new Student("zhangsan",18,90);
      HashSet sh=new HashSet();
      sh.add(s1);
      sh.add(s2);
      sh.add(s3);
      sh.add(s4);
      System.out.println(sh);
	}
}
