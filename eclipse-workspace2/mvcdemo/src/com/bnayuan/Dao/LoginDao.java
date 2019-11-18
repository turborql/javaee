package com.bnayuan.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.banyuan.enity.Login;

//模型层：用于处理登陆(查询数据)
public class LoginDao {
	public int  login(Login login) {
		Connection conn=BaseDB.getConnection();
		int count=0;
		try {
			//只要count>0说明是登陆信息是正确的
			String sql="select count(*) from login where uname=? and upwd=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			//将传入的登陆信息赋值给sql语句
			ps.setString(1, login.getUname());
			ps.setString(2, login.getUpwd());
			//执行查询语句
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {//判断是否有数据
				count=rs.getInt(1);//获取查询的结果
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
				
	}
}
