package com.banyuan.test;

public class OverloadingOrder {
static void f(String s,int i) {
	System.out.println(1);
}
static void f(int i,String s) {
	System.out.println(2);
}
public static void main(String[] args) {
	f("a",1);
	f(1,"a");
//	OverloadingOrder.f(i, s);
}
}
