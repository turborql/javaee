package com.banyuan.test1;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
       HashSet<String> hs=new HashSet<String>();
       hs.add("china");
       System.out.println(hs);//必须迭代才能输出?
      Iterator <String> it= hs.iterator();
      while(it.hasNext()) {
    	 String s= it.next();
    	 System.out.println(s);
      }
	}
}
