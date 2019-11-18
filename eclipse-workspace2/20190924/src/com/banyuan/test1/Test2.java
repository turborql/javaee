package com.banyuan.test1;

public class Test2 {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	Class c1=Class.forName("com.banyuan.test1.Cat");
	System.out.println("c1="+c1);
	Object obj=c1.newInstance();
	
}
}
