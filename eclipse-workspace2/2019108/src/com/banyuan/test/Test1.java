package com.banyuan.test;

import java.lang.reflect.Proxy;

public class Test1 {
public static void main(String[] args) {
//	Proxy提供用于创建动态代理类和实例的静态方法，他还是由这些方法创建的所有动态代理类的超类
//	InvocationHandler 
//	Singable singer=new Singer();
	Singer singer=new Singer();
	MyHandler handler=new MyHandler(singer);
	//不能使用singer会报错
	Singable f=(Singable)Proxy.newProxyInstance(Singable.class.getClassLoader(), new Class[] {Singable.class}, handler);
	f.sing();//调用接口的方法？
}
}
