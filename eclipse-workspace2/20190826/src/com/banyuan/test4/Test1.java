package com.banyuan.test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test1 {
	int year;
	int month;
	static String[] s1;
	static String s;
	static String st;
	static int monthday;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		s1 = st.split("-");
		int i = Number(s1[0], s1[1], 1);
		monthday = MonthDays(Integer.valueOf(s1[0]), Integer.valueOf(s1[1]));
		print(s1[0], s1[1], i);
	}

	public static void print(String year, String month, int i) {
		// 打印表头
		System.out.println("一" + "\t" + "二" + "\t" + "三" + "\t" + "四" + "\t" + "五" + "\t" + "六" + "\t" + "日");
		// 打印制表符
		print1(i);
		for (int j = 1; j <= monthday; j++) {
			int week=Number(year, month, j);
			System.out.print(j+"\t");
			if(week==7) {
				System.out.println();
			}
		}

	}

	// 获取输入当天的星期对应的数字
	public static int Number(String year, String month, int i) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			// 把输入的字符串变成日期
			Date date = sdf.parse(year + "-" + month + "-" + String.valueOf(i));
			SimpleDateFormat sdf1 = new SimpleDateFormat("EEE");
			s = sdf1.format(date);
//			 System.out.println(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int w = week(s);
		return w;
//		System.out.println(w);

	}

	public static void print1(int a) {
		for (int i = 1; i < a; i++) {
			System.out.print("\t");
		}
	}

	public static int week(String str) {
		switch (str) {
		case "星期一":
			return 1;
		case "星期二":
			return 2;
		case "星期三":
			return 3;
		case "星期四":
			return 4;
		case "星期五":
			return 5;
		case "星期六":
			return 6;
		case "星期日":
			return 7;
		}
		return 0;
	}

	public static boolean leapYear(int year) {
		if (year % 4 == 0 && year != 100 || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public static int MonthDays(int year, int month) {
		if (month == 2) {
			if (leapYear(year)) {
				return 29;
			}
			return 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else {
			return 31;
		}

	}
}
