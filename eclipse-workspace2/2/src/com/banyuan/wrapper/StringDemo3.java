package com.banyuan.wrapper;

public class StringDemo3 {
	public static void main(String[] args) {
		// 创建一个StringBuffer对象，初始容量为16
		// 当创建StringBuffer对象的时候，在底层创建了一个长度为16的char类型的数组
		/*
		 * public StringBuffer() { super(16);}
		 */

		StringBuffer sb = new StringBuffer();
		// 当创建StringBuffer对象的时候，在底层创建了一个长度为16+3的char类型的数组
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb.length());// 0
		System.out.println(sb2.length());// 3
	//1、添加方法为append（...）
		sb.append("helloworld111");
		sb.append("helloworld222");
		sb.append("helloworld333");
		System.out.println(sb);//helloworld111helloworld222helloworld333
		System.out.println("sb的长度"+sb.length());//sb的长度39
		System.out.println("实际容量"+sb.capacity());//实际容量70
		sb.append(true).append("hello").append('a');
		System.out.println(sb);//helloworld111helloworld222helloworld333truehelloa
	sb.insert(2, '你');
	System.out.println(sb);//he你lloworld111helloworld222helloworld333truehelloa
	
	}
}
