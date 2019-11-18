package com.banyuan.test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//不懂
public class Test3 {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(1,"hello");
//	Set<Integer,String> s=hm.entrySet();
	Set<Map.Entry<Integer, String>> s=hm.entrySet();//如果导包Map可以省略
	Iterator<Map.Entry<Integer, String>> it=s.iterator();
	while(it.hasNext()) {
		Map.Entry<Integer, String> i=it.next();
		Integer i1=i.getKey();
		String s1=i.getValue();
		System.out.println(i1+"="+s1);
	}

	
}
}
