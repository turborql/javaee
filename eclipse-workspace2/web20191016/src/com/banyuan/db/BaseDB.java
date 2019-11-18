package com.banyuan.db;

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
	static String user = "null";
	static String password = "null";
//读properties中的数据库信息
      static {
    	  Properties p = new Properties();
    	  InputStream is=BaseDB.class.getClassLoader().getResourceAsStream("db.properties");  
    	  try {
			p.load(is);
			url=p.getProperty(url);
			user=p.getProperty(user);
			password=p.getProperty(password);			
		} catch (IOException e) {
			e.printStackTrace();
		}	  
      }
      
//获取连接
      public static Connection getConnection() {
    	  Connection conn=null;
    	  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn=DriverManager.getConnection(url, user, password);	
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
