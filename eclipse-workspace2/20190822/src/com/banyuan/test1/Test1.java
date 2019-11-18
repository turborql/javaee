package com.banyuan.test1;

import java.util.LinkedList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List ls = new LinkedList();//接口指向实现类
		LinkedList ls=new LinkedList();
//		ls.add("zhangsan");
//		ls.add(12);
//		System.out.println(ls);
//		ls.addFirst("hello");
		ls.push("hello");//入栈
		ls.push("world");
		ls.push("china");
		System.out.println(ls);
		Object obj=ls.pop();//弹栈removes and returns the first element of this list.
		System.out.println(obj);
		System.out.println(ls);
		
		/*结果：[china, world, hello]
				china
				[world, hello]*/

	}

}
