package com.banyuan.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		//对集合使用迭代器进行获取，获取的时候判断集合中是否存在“abc3”对象，如果有添加一个元素“ABC3”
		//在遍历过程中，使用了集合方法修改了集合的长度，是不允许的
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String s=it.next();
			//对获取的元素，进行判断，是不是有“abc3”
			//字符串的比较要用equals
			if(s.equals("abc3")) {
				list.add("ABC3");//java.util.ConcurrentModificationException
			}
		}
		

	}

}
