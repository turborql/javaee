package com.banuan.DBUtil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BaseDB {

	static String url = "null";
	static String username = "null";
	static String password = "null";

	static {
		Properties p = new Properties();
		try {
//			p.load(new FileReader("db.properties"));
//利用反射读取db.properties文件，和原来的javase项目不同
			InputStream is = BaseDB.class.getClassLoader().getResourceAsStream("db.properties");
			p.load(is);
			url = p.getProperty("url");
			username = p.getProperty("username");
			password = p.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 提供两个静态方法，同包下直接类名.调用
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 读取db.properties,提取到static代码块里面，这样只需要加载一次就ok
//			Properties p = new Properties();
//			p.load(new FileReader("db.properties"));
//			String url = p.getProperty("url");
//			String username = p.getProperty("username");
//			String password = p.getProperty("password");
			conn = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}

	public static void DBClose(Connection conn, Statement ps, ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
