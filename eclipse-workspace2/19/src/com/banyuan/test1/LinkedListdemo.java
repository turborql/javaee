package com.banyuan.test1;

import java.util.LinkedList;

public class LinkedListdemo {
//研究子类的特有功能，就不能使用多态调用
	public static void main(String[] args) {
//		function();
		function1();
	}
	//1.addFirst(E)添加到链表的开头
	//2.addLast(E)添加到链表的结尾
	public static void function() {
		LinkedList<String> link=new LinkedList<String>();
		link.addLast("e");
		link.add("abc");
		link.add("bcd");
		
		link.addFirst("f");
		System.out.println(link);//[f, e, abc, bcd]
		
	}
	//3.E getFirst()获取链表的开头
	//4.E getLast()获取链表的结尾
	public static void function1() {
			LinkedList<String> link=new LinkedList<String>();
			link.add("1");
			link.add("2");
			link.add("3");
		String s=link.get(1);//索引
		System.out.println(s);
			if(link.isEmpty()) {//来自Collection
				String first=link.getFirst();
				String last=link.getLast();
				System.out.println(first);
				System.out.println(last);	
			}
			if(link.size()!=0) {//来自Collection
				String first=link.getFirst();
				String last=link.getLast();
				System.out.println(first);
				System.out.println(last);	
			}
	}
	//E removeFirst()移除并返回链表的开头
	//E removeLast()移除并返回链表的结尾
	

}
