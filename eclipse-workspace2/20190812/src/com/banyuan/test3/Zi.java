package com.banyuan.test3;

public class Zi extends Fu{
	{
		System.out.println("子类构造代码块");
	}
	static{
		System.out.println("子类静态初始化代码块");
	}
	public Zi(){
		System.out.println("子类构造方法");
	}
}
