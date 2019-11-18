package com.banyuan.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.banyuan.db.BaseDB;
import com.banyuan.entity.Login;

public class LoginDao {
	public int query(Login login) {
		PreparedStatement ps=null;
		ResultSet rs=null;
		int result=0;
        Connection conn= BaseDB.getConnection();
        String sql="select count(*) a from stuifo where name=? and password=?";
//        System.out.println("======");
		try {
			ps = conn.prepareStatement(sql);
//			System.out.println("*****");
			ps.setString(1, login.getName());
			ps.setString(2, login.getPassword());
			System.out.println(login);
			 rs=ps.executeQuery();
			while(rs.next()) {
			result=rs.getInt("a");
			System.out.println(result);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			BaseDB.DBClose(conn, ps, rs);
		}
        
		return result;
	}

}
