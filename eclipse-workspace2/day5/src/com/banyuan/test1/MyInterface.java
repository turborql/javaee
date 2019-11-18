package com.banyuan.test1;

/*
 * 定义接口
 *     使用关键字interface   接口名字  
 * 接口定义：
 *     成员方法全部都是抽象方法（不能定义带有方法体的方法） 
 * 接口中定义抽象方法固定格式：
 *     public abstrct 返回值类型  方法名字（参数列表）；
 *     修饰符public,写或者不写，都是public    
 * 接口中成员变量的定义： 
 *     必须定义为常量！！！
 *     格式为：public static final 数据类型 变量名=值        
 * */
public interface MyInterface {
//在接口中定义成员变量
	public static final int a = 1;
	public final static double b = 2.2;

//在接口中定义抽象方法
	public abstract void function();

}
