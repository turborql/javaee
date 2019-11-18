package com.banyuan.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ql";
		String user="root";
		String password="Root_123";
		Connection conn=DriverManager.getConnection(url, user, password);
	String name="zhangsan";
	String pwd="a1234' or '1'= '";
//	st.exescuteQuery("select * from usermanager where name=" +zhangsan+ "and password")
		
		
		
	}
	

}
