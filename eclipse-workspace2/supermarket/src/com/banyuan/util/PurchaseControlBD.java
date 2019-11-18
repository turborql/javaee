package com.banyuan.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;
public class PurchaseControlBD {
// 查询显示数据库
	public   Vector getDBData(){
		Vector data=new Vector();
	
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection conn = null;
		// 查询数据库
		try {
			Properties p = new Properties();
			p.load(new FileReader("db.properties"));
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");

			// 加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 创建链接
			conn = DriverManager.getConnection(url, user, password);
			// 创建SQL语句
			String sql1= "select * from addstorage";
//			String sql1= "select * from addstorage left join goods on addstorage.commodityid=goods.commodityid ";
			ps = conn.prepareStatement(sql1);
			//执行查询
			rs = ps.executeQuery();
			while (rs.next()) {
				Vector line = new Vector();
				line.add(rs.getObject(1));
				line.add(rs.getObject(2));
				line.add(rs.getObject(3));
				line.add(rs.getObject(4));				
				data.add(line);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			if (rs != null) {

				try {
					rs.close();
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
		return data;
}
public void insertDBData(String Num,String operator,String  count,String goodsSum,String warhousingtime,String moneySum) {
		
		try {

			// 1.加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");//
			System.out.println("ok");
			// 2.获取mysql数据库连接
			String url = "jdbc:mysql://localhost:3306/ql";
			String user = "root";
			String password = "Root_123";
			// 驱动管理器DriverManager
			Connection conn = DriverManager.getConnection(url, user, password);

			// 3、构造sql语句
//			String sql = "insert into addstorage（commodityname,commodityid,unit,price,count,Warehousingtime,expirationtime,operator) values(?,?,?,?,?,?)";
			String sql = "insert into addstorage values(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setObject(1, "");
		    ps.setObject(2,Num);
		    ps.setObject(3, "");
		    ps.setObject(4, "");
		    ps.setObject(5,count);
		    ps.setObject(6,warhousingtime);
		    ps.setObject(7, "");
		    ps.setObject(8,operator);
			// 4、执行插入的内容，在终端查看
			ps.executeUpdate();
			
			
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
