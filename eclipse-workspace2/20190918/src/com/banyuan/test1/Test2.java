package com.banyuan.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test2 {
	public static void main(String[] args) {
		try {
			
			// 1.加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");// 
			System.out.println("ok");
			// 2.获取mysql数据库连接
			String url = "jdbc:mysql://localhost:3306/ql";
			String user = "root";
			String password = "Root_123";
			//驱动管理器DriverManager
			Connection conn = DriverManager.getConnection(url, user, password);

			// 3、构造sql语句
			String sql = "select * from student5";
			PreparedStatement ps = conn.prepareStatement(sql);
			//查询结果--查询
			ResultSet rs = ps.executeQuery();
			//rs.next()能不能取到下一行
			while (rs.next()) {
				//从1开始的
				System.out.println(rs.getObject(1) + " " + rs.getObject(2));
			}
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
