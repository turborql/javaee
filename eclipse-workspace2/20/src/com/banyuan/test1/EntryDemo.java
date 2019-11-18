package com.banyuan.test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Map集合获取方法
 * entrySet方法，键值对映射关系获取
 * 实现步骤：
 * 1.调用map集合方法entrySet()将集合中的映射关系对象，存储到Set集合
 * Set<Entry <k,v>>
 * 2.迭代Set集合
 * 3.获取出的Set集合的元素，是映射关系对象
 * 4.通过映射关系对象方法getKey,getValue获取键值对
 * */
public class EntryDemo {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(1, "abc");
	map.put(2, "bcd");
	map.put(3, "cde");
//	1.调用map集合方法entrySet()将集合中的映射关系对象，存储到Set集合
//	 *Set<Entry <k,v>>
	Set<Map.Entry<Integer, String>> set=map.entrySet();
//	2.迭代Set集合
	Iterator<Map.Entry<Integer, String>> it=set.iterator();
	while (it.hasNext()) {
//		3.it.next获取的是什么对象，也是Map.entry对象
		Map.Entry<Integer,String> entry=it.next();
//	4.通过映射关系对象方法getKey,getValue获取键值对
		Integer key=entry.getKey();
		String value=entry.getValue();
		System.out.println("key="+key+","+"value="+value);
	}
	
}
}
