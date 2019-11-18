package com.banyuan.test1;

public class Test3 {
public static void main(String[] args) {
	try {
		Class cs1=Class.forName("com.banyuan.test1.Cat");
		Object object=cs1.newInstance();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
