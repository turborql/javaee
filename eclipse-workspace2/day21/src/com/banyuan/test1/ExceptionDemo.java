package com.banyuan.test1;
//异常中的关键字 
/*throw,必须在方法中，抛出异常   
异常出现后面就不会执行了*/
/*
 * 方法中声明异常关键字
 * throws 用于在方法的声明上，标明此方法可能出现异常，请调用者处理    
 * 且必须写异常类的类名
 * */
//调用了一个抛出异常的方法，调用者就必须处理，不处理就编译失败
public class ExceptionDemo {
public static void main(String[] args)throws Exception {
	int[] arr=null;
//	int[] arry= {};
	int i=getArray(arr);
	System.out.println(i);
}
public static int getArray(int[] arr) throws Exception{
	//对方法参数进行合法性对判断，判断是不是null
	if(arr==null) {
		//抛出异常的形式告诉调用者
		throw new Exception("传递的数组不存在");		
	}
	int i = arr [arr.length-1];
	return i*2;
}
/*public static int getArray(int[] arry) throws Exception{
	//对方法参数进行合法性对判断
	if(arry.length==0) {
		//抛出异常的形式告诉调用者
		throw new Exception("数组中没有任何元素");		
	}
	int i = arry [arry.length-1];
	return i*2;
}*/
}
