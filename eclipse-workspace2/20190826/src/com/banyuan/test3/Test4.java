package com.banyuan.test3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
	/*将字符串变成日期对象String-->parse
	1.创建SimpleDateFormat的对象，构造方法中，指定日期模式
	2.子类对象调用方法parse传递String ,返回Date
	 */
	// 在main抛异常jvm处理
    //public static void main(String[] args) throws ParseException {
	public static void main(String[] args)  {
		// 调用了SimpleDateFormat(String pattern)构造方法
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date1 = sdf.parse("1995-5-6");
			System.out.println(date1);
			sdf = new SimpleDateFormat("yyyy-MM-dd EEE");
			String s = sdf.format(date1);
			System.out.println(s);
		} catch (ParseException e) {
//         System.out.println("异常");
			e.printStackTrace();
		}
	}
}
