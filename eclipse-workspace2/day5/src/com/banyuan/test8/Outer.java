package com.banyuan.test8;

public class Outer {
int i=1;
class Inner{
	int i=2;
	public void inner() {
		int i=3;
		System.out.println(i);//3
		System.out.println(this.i);//2
		System.out.println(Outer.this.i);//1		
	}
}
}
