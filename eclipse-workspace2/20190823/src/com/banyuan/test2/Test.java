package com.banyuan.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
//		HashMap hm=new HashMap();
//        hm.put("a",1);
//        hm.put("b",1);
//        hm.put("a",2);
//        hm.put("a",3);
////        int a=hm.size();
////		System.out.println(a);
//		Set keys=hm.keySet();
//		System.out.println(keys);
//		Iterator it=keys.iterator();
//		  while(it.hasNext()) {
//			  Object key=it.next();
////			  System.out.println("key="+key);
////			  Object value=hm.get(key);
////			  System.out.println("value="+value);
//			  
//		  }
//        集合 key value
//		  Scanner nextLine->String-->charAt(i)
		//toCharArrey()
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();//可以接受空格
		char[] arr=str.toCharArray();
		HashMap hm=new HashMap();
		for(char a:arr) {
			//如果已经存在，则加1
			if(hm.containsKey(a)) {
				Object v=hm.get(a);
				Integer count=Integer.valueOf(String.valueOf(v));//String自动导包
				hm.put(a,count+1);
			}else {
				//第一次出现，value=1;
				hm.put(a,1);
			}
		}		
		System.out.println(hm);
		
			Set set=hm.entrySet();
			Iterator it=set.iterator();
			while(it.hasNext()) {
				Object obj=it.next();
				String key=String.valueOf(obj);
				Integer value = Integer.valueOf(String.valueOf(hm.get(key)));
			}
		
		
		
		
	}

}
