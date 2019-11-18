package com.banyuan.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test1 {
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
			String sql = "insert into student5(name) values('abc')";
			
			
			PreparedStatement ps=conn.prepareStatement(sql);
			
			//4、执行插入的内容，在终端查看
			ps.executeUpdate();
			System.out.println(ps.executeUpdate());
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
