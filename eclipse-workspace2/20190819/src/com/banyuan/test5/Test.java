package com.banyuan.test5;

import java.util.ArrayList;
import java.util.Iterator;



public class Test {
//Collection
	//Map
	//ArrayList<E>
	//Iterator
	public static void main(String[] args) {
		ArrayList al=new ArrayList();//出现警告的原因、
		int a=100;
		Integer b=a;
		al.add(123);
		al.add(a);
		al.add("hello");
		//System.out.println(al);//ArrayList重写了toString ,点ArrayList看源码
		Iterator  e=al.iterator();//导包
		int i=0;
		while(e.hasNext()) {
			i++;
			Object obj=e.next();
			if(i!=1) {			
				System.out.print(",");
			}
			System.out.print(obj);
		}
		
	}
	
	
}
