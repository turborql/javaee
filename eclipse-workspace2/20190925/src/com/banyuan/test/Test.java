package com.banyuan.test;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		try {
			Class c=Class.forName("com.banyuan.test.Person");
			
//          Constructor cc=c.getDeclaredConstructor();
//			for (Constructor constructor : cc) {
//				System.out.println(constructor);
//			}
			//Object o=cc.newInstance();
			//System.out.println(o);
			
		    Method m=c.getDeclaredMethod("run",int.class);
		    m.setAccessible(true);
             
		    m.invoke(c.newInstance(),3);
		    
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}
