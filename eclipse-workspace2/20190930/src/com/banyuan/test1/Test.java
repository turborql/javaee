package com.banyuan.test1;

public class Test {
public static void main(String[] args) {
	//1:目标类
	//2:代理类
	MyInterface mc1=new MyClass1();
	MyInterface mc2=new MyClass2(mc1);
	mc2.run();
}
}
