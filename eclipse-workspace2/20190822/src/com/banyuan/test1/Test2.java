package com.banyuan.test1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.push("hello");
//	System.out.println(ll);
	ll.push("world");
//	System.out.println(ll);
	Object obj=ll.pop();
	System.out.println("被弹出的元素"+obj);
	System.out.println(ll);
	
	
	Object[] arr=ll.toArray();
	for(Object o:arr) {
		System.out.println(o);
	}
		//数组的排序，util   Arrays(排序)，
	    
	
	//int 
	//int[] a数组是对象  ，Object的toStirng
	//Integer 类toStirng()
//	int[] a= {1,99,100};//基本数据类型，用的是Object的toStirng
	Byte[] b= {1,99,10};//写成包装类会是我们想要的，有重写的toString
//	List list=Arrays.asList(a);
	List list=Arrays.asList(b);//数组转集合
	
	System.out.println(list);
	
}
}
