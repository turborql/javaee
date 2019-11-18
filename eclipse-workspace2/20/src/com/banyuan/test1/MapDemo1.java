package com.banyuan.test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
public static void main(String[] args) {
	Map<String,Integer>map=new HashMap<String,Integer>();
	map.put("a", 11);
	map.put("b", 12);
	map.put("c", 13);
	map.put("d", 14);
	//方法一：
	//1.调用keyset(),将所有的键存到Set集合中
	Set<String> set=map.keySet();
	//2.遍历Set集合，取出所有的元素
	Iterator<String> it=set.iterator();
	while(it.hasNext()) {
		String key=it.next();//返回的是Set集合的元素，也就是Map中的键
		//3.调用Map集合方法get，通过键获取到值
		Integer value=map.get(key);
		System.out.println(key+".."+value);
	}	
	System.out.println("==========");
	//方法二：
	for(String key:set) {
		Integer value=map.get(key);
		System.out.println(key+"..."+value);
	}
}
}
