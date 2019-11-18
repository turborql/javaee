package com.banyuan.test1;
/*
 * 类实现接口   
 * 关键字implements
 * class   类    implements     接口{
 *         重写接口中的抽象方法
 * }
 *               类             实现         接口
 *public class MyInterfaceImp implements MyInterface
 * */

public class MyInterfaceImp implements MyInterface {
	public void function() {
		System.out.println("实现类重写接口方法");
	}
}
