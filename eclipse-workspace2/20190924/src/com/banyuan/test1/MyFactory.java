package com.banyuan.test1;

public class MyFactory {
public Object createObject(String name) {	
	Object object=null;
	
//	if("car".equals(name)) {
//		object=new Car();
//	}else if("apple".equals(name)){
//		object=new Apple();
//	}
	
	try {
		Class cs1=Class.forName(name);
		object=cs1.newInstance();
		
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
	
	return object;
}
}
