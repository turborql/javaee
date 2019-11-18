package com.banyuan.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
	private Singable singer;
    public MyHandler(Singable singer) {
	this.singer=singer;
}
	
	
	@Override//反射的方式调用函数
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("--invoke--");//可以用日志
		System.out.println("请周杰伦喝奶茶");
		Object obj=method.invoke(singer, args);
		System.out.println("泡温泉");
		return obj;
	}

}
