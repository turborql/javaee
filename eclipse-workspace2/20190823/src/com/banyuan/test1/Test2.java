package com.banyuan.test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class Test2 {
public static void main(String[] args) {
	// TODO Auto-generated method stub
   HashMap hm=new HashMap();
   Person p1=new Person(1,"zhangsan",100);
   Person p2=new Person(1,"lisi",100);
   hm.put(1,p1);
   hm.put(2,p2);
//   System.out.println(hm);
   
   //自己遍历打印1
  Set keys=hm.keySet();//不明白
  //打印2
//  Set s=hm.entrySet();//返回的是Set集合
//  Iterator it=s.iterator();
  Iterator it=keys.iterator();
  while(it.hasNext()) {
	  Object key=it.next();
	  System.out.println("key="+key);
	  Object value=hm.get(key);
	  System.out.println("value="+value);
	  
  }
 
}
}
