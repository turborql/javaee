package com.banyuan.test2;

public class Test {
	public static void main(String[] args) {
		//使用接口中定义的常量
		// 常量被静态修饰，可以被接口的名字直接调用
		System.out.println(MyInter.x);
		MyInterImp my=new MyInterImp();
		System.out.println(my.getSum(3,4));
	}
}
