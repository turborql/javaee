package com.banyuan.dao;

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

import com.banyuan.entity.Student;
import com.banyuan.util.BaseDB;

public class StudentDaoImp implements StudentDao {
	private BaseDB bd=new BaseDB();
	
	public void modify(String sql,Object...args) {
		Connection conn=bd.getConnection();
		PreparedStatement ps=null;
		try {
			ps=conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++) {
				ps.setObject(i+1, args[i]);
			}
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updataData(Student student) {
//		Connection conn=null;
		PreparedStatement ps=null;
		
		try {
//			//通过BaseDB获取连接
//			
//			conn=bd.getConnection();
//			
//			//改
			String sql="update stu_info1 set name=? ,age=? where id=?";
			modify(sql,student.getName(),student.getAge(),student.getId());
//			ps.setObject(1, student.getName());
//			ps.setObject(2, student.getAge());
//			ps.setObject(3, student.getId());
//			ps=conn.prepareStatement(sql);
//			
//			ps.executeUpdate();
//		}
			
		}finally {
			try {
				bd.DBClose(conn, ps, null);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	public void insertData(Student student) {
		Vector data=new Vector();
		Connection conn=null;
		PreparedStatement ps=null;
		
		try {
			//通过BaseDB获取连接
			
			bd.getConnection();
			
			//插入数据                                        占位符号
			String sql="insert into stu_info1(name,age) values(?,?)";
			//这步有顺序吗
			ps.setObject(1, student.getName());
			ps.setObject(2, student.getAge());
			ps=conn.prepareStatement(sql);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bd.DBClose(conn, ps, null);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
@Override
public Vector getData(int curPage, int count) {
	BaseDB bd=new BaseDB();
	Vector data=new Vector();
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	try {
		//通过BaseDB获取连接
		
		bd.getConnection();
		
		String sql="select * from stu_info1 limit ?,?";
		ps=conn.prepareStatement(sql);
		
		rs=ps.executeQuery();
		
		while(rs.next()) {
			Vector line=new Vector();
			line.add(rs.getObject(1));
			line.add(rs.getObject(2));
			line.add(rs.getObject(3));
			line.add(rs.getObject(4));
			line.add(rs.getObject(5));
			
			data.add(line);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		
		try {
			bd.DBClose(conn, ps, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	return data;
}
}
