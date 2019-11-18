package com.banyuan.test1;

import java.util.Date;

public class DataDemo {
public static void main(String[] args) {
	//1000毫秒=1秒
	//毫秒的0点：System.currentTimeMillis():获取当前日期的毫秒值 
	//时间原点：公元1970年1月1日，午夜0:00:00，毫秒值就是0   
	
//	Date d=new Date();
//	long time=System.currentTimeMillis();
//	System.out.println(time);    
	function3();
	
}
//1.Date()获取到的是当前操作系统中的时间和日期Sun Aug 25 23:05:00 CST 2019
public static void function() {
	Date date=new Date();
	System.out.println(date);
}
//2.Date(long)long型参数表示毫秒值
public static void function1() {
	Date date=new Date(0);
	System.out.println(date);
}
//3.getTime(),返回long毫秒值，将Date表示的日期转成毫秒值（日期毫秒转换）
public static void function2() {
	Date date=new Date();
	long time=date.getTime();
	System.out.println(time);
}
//4.setTime(long)传递毫秒值；将日期对象设置到指定毫秒上，毫秒值转成日期对象
public static void function3() {
	Date date =new Date();
	System.out.println(date);
	date.setTime(0);
	System.out.println(date);
}

}
