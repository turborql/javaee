package com.banyuan.test1;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		//创建执行存储过程的对象
		CallableStatement cs = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ql", "root", "Root_123");
		cs = conn.prepareCall("{call s(?,?)}");
		
		//设置输入参数
		cs.setObject(1, 2);
		//注册输出参数
		cs.registerOutParameter(2, Types.DECIMAL);
		//调用存储过程
		cs.execute();
		//得到存储过程的输出参数值
		System.out.println(cs.getBigDecimal(2));
		conn.close();
		cs.close();
	}
}
