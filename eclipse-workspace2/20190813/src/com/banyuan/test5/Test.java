package com.banyuan.test5;

public class Test {

	public static void main(String[] args) {
//		MyInterface.AGE=10;常量不能被改变//error
//		MyInterface mi=new MyInterface();Cannot instantiate the type MyInterface
		MyInterface mi=new MyInterfaceimp();
		mi.test2();
		System.out.println(MyInterface.AGE);//因为是静态的，所以可以接口名直接调用
		
	}

}
