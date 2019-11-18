package com.banyuan.test2;

/*
 * 1、接口中成员变量的特点，其实没有变量，只有常量 
 * 固定格式：public static final 数据类型 变量名 =值；
 * static 可以被接口名直接.调用
 * final  固定住变量的值
 * 
 * 注意：public static final修饰符，在接口定义中，可以省略不写
 * 但是不等于没有
 * 三个修饰符还可以选择性书写
 * 2、接口中成员方法特点
 * public abstract 返回值类型 方法名（参数列表）；
 * 修饰符public abstract可以不写，选择性书写
 * 但是写不写都有
 * 3、实现类，实现接口，需要重写接口全部抽象方法，创建实现类对象
 */
public interface MyInter {
	public static final int x = 3;

	void show();
	public abstract int getSum(int a,int b);
}
