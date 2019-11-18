package com.banyuan.test;

import java.util.Date;
//import java.sql.Date;

public class TestDate {
public static void main(String[] args) {
	Date d=new Date();
	System.out.println(d);
	java.sql.Date d1=new java.sql.Date(d.getTime());
	System.out.println(d1);
	
}
}
