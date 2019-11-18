package com.banyuan.test1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProcedureTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		//创建执行存储过程的对象
		CallableStatement cs = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ql", "root", "Root_123");
		
		cs = conn.prepareCall("{call stu(?)}");
		
		//给存储过程的参数赋值
		cs.setInt(1, 2);
		cs.execute();
		
		conn.close();
		cs.close();
	}
}
