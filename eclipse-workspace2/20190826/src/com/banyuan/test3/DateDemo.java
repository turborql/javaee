package com.banyuan.test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
//	LocalDate ld=new LocalDate();//since1.8 
		Date date = new Date();
		System.out.println(date);// 获取到的是当前操作系统中的时间和日期
		// 把获取的日期转成自己要想的格式->使用DateFormat的子类SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒  EEE");
		// 把字符串变成日期格式
		String str = sdf.format(date);
		System.out.println(str);
	}
}
