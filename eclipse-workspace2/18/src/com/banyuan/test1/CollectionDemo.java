package com.banyuan.test1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		function();
		funciton1();
		funciton2();
	}

	// 1.void clear()清空所有元素,但是集合容器本身依然存在
	public static void function() {
		// 多态
		Collection<String> cl = new ArrayList<String>();
		boolean b=cl.add("abc");
		System.out.println(b);//true，add返回值为boolean
		cl.add("bcd");
		System.out.println(cl);
		cl.clear();
		System.out.println(cl);
	}

	// 2.boolean contains(Object o)判断对象是否存在集合中，对象对在返回true
	public static void funciton1() {
		Collection<String> cl = new ArrayList<String>();
		cl.add("abc");
		cl.add("bcd");
		cl.add("123");// 字符串类型
		boolean b = cl.contains(123);// Integer类型
		System.out.println(b);// false
	}
	// 3.int size()返回集合中的元素的个数
	/*
	 * 数组.length 属性 int String.length() 方法 int 集合.size() 方法int
	 */
    //4.　Object[]  toArray()集合中的元素转成数组中的元素（集合转数组）返回的是一个存储对象的数组，
	//IO里面会用获取文件夹下的文件
	public static void funciton2() {
		Collection<String> cl = new ArrayList<String>();
		cl.add("abc");
		cl.add("bcd");
		cl.add("123");// 字符串类型
		Object[] objs=cl.toArray();
		for(int i=0;i<objs.length;i++) {
			System.out.println(objs[i]);
		}
	}
	//5、boolean remove(Object o)移除集合中指定元素
	//如果出现重复的元素，删除的是第一个遇到的元素
	public static void function3() {
		Collection<String> cl = new ArrayList<String>();
		cl.add("abc");
		cl.add("bcd");
		System.out.println(cl);
		boolean b=cl.remove(cl);
		System.out.println(b);
	}
}
