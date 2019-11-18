package com.banyuan.test1;

import java.util.HashMap;
import java.util.Map;

//Map接口中的常用方法，使用实现类HashMap
public class MapDemo {
	public static void main(String[] args) {
		function();
		function1();
		function2();
	}

//1.将键值存储到集合中，v put(k,v)k作为键的对象，v作为值的对象  
//存储的是重复的键，将原有的值覆盖
//返回值一般情况下返回null,当你存储的是重复键，返回的是被覆盖之前的值
	public static void function() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer i = map.put("a", 1);
		System.out.println(i);
		map.put("b", 2);
		Integer j = map.put("c", 3);
		System.out.println(j);
		Integer k = map.put("c", 5);
		System.out.println(k);
		System.out.println(map);
	}
//2.v get(K)通过键得到对应的值
	public static void function1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		System.out.println(map);
		Integer value=map.get("a");
		System.out.println(value);
	}
	//3. v remove(k)移除集合中的键值对，返回被移除之前的值
	public static void function2() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
//		System.out.println(map);
		Integer value=map.remove("a");
				System.out.println(value);
				System.out.println(map);

	}
}
