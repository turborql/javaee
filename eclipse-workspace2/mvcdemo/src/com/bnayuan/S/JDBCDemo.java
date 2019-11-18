package com.bnayuan.S;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo {
	public void update() {
		String url = "jdbc:mysql://localhost:3306/ql";
		String user = "root";
		String password = "Root_123";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver.class");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "insert into stu_info values('zhangsan',20)";
			ps = conn.prepareStatement(sql);
			int count = ps.executeUpdate();
			if (count > 0) {
				System.out.println("操作成功！");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
