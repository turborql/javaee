package com.banyuan.test1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 对日期进行格式化：
 * 对日期格式化的类java.text.DateFormat;抽象类，普通方法，也有抽象方法
 * 实际使用的是子类java.text.SimpleDateFormat;可以使用父类普通方法，重写了抽象方法
 * */

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		function();
	}
//1.创建SimpleDateFormat对象，在类构造方法中，写入字符串的日期格式
/*2.SimpleDateFormat调用方法format对日期进行格式化String format（Date date)传递日期对象，返回字符串
日期模式：
yyyy 年份
MM   月份
dd   月中的天数
HH   0-23小时
mm   小时中的分钟
ss   秒
*/
	public static void function() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH点mm分钟ss秒");
		String date=sdf.format(new Date());
		System.out.println(date);
		
	}
}
