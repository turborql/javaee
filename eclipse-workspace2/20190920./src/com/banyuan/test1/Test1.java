package com.banyuan.test1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Test1 {
	
	public static void main(String[] args) {
		ResultSet rs=null;
		PreparedStatement ps=null;
		Connection conn =null;
		try {
			// 加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 获取链接
//		String url="jdbc:mysql://localhost:3306//ql";
//		String user="root";
//		String password="Root_123";
			// 读取db.properties
			Properties p = new Properties();
			//将文件读入
			p.load(new FileReader("db.properties"));
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			conn = DriverManager.getConnection(url, user, password);
//			String sql = "select * from stu_info1 limit 0,3";
			//分页
			String sql = "select * from stu_info1 limit ?,?";
						//？
			ps = conn.prepareStatement(sql);
			ps.setObject(1, 0);
			ps.setObject(2, 3);
			//注意参数的选择
			rs=ps.executeQuery();
			//添加表头
//			System.out.println("id\tname\tage\tbirthday");
			while(rs.next()) {
				System.out.println(rs.getObject(1)+" \t"+rs.getObject(2)+"\t"+rs.getObject(3)+"\t"+rs.getObject(4));
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			}
		}
	}

}
