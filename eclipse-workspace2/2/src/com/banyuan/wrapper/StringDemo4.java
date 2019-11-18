package com.banyuan.wrapper;

public class StringDemo4 {
	public static void main(String[] args) {
	StringBuffer sb1=new StringBuffer("abc");
	StringBuffer sb2=new StringBuffer("abc");
	System.out.println("sb1==sb2:"+(sb1==sb2));//false
	//StringBuffer没重写equals()方法
	System.out.println("sb1.equals(sb2):"+sb1.equals(sb2));//false
	//调用toString可以比较
	System.out.println(sb1.toString().equals(sb2.toString()));//true
	}
}
