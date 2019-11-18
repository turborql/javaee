package com.banyuan.test1;

import java.util.ArrayList;
import java.util.List;

/*
 * List接口继承Collection接口
 * List接口特点：有序，索引，可以重复元素
 * 实现类：ArrayList，LinkedList，vector
 * List接口中的抽象方法，有一部分方法和它的父接口Collection一样
 * List接口的特有方法：一般找带索引的功能
 * 
 * */
public class ListDemo {
//1.boolean add(E e)
	public static void main(String[] args) {
//			function();
//			funtion1();
			function2();
	}
	//2.void add(int index,E element)将元素插入到列表(List)的指定索引
	public static void function() {
		List<String> list=new ArrayList<String>();//command+shif+o导包
		list.add(0, "123");
		list.add(1,"1");
		System.out.println(list);
		list.add(1, "12");
		System.out.println(list);//注意IndexOutOfBoundsExcepiton集合中的越界异常
		// 3.E get(int index)传一个索引，返回集合中的元素
		String s=list.get(0);
		System.out.println(s);
	}
	//4.E remove(int index)//移除指定索引上的元素,并且返回被删除的那个元素
	public static void funtion1() {
		List<Double> list=new ArrayList<Double>();
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		Double d=list.remove(0);
		System.out.println(d);
		System.out.println(list);
		
	}
	//6.E set(int index.E element)修改指定索引上的元素，并且返回被修改之前的元素
	public static void function2() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		Integer i=list.set(0, 5);
		System.out.println(i);
	}
	//5.boolean remove(Object o)//从此列表中移除第一次出现的指定元素Collection中的
//    List遍历方法：迭代器，forEach，for循
}
