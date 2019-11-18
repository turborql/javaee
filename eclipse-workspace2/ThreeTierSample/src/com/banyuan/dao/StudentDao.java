package com.banyuan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import com.banyuan.entity.Student;

//数据访问层：原子性的增删改查
public class StudentDao {
	// 根据学号判断学生是否存在；使用方法调用以及三目运算符号
	public boolean isExist(int sno) {
		return queryStudentByNo(sno) == null ? false : true;
	}

	// 增加学生信息
	public boolean addStudent(Student student) {
		ResultSet rs = null;
		Connection conn = BaseDB.getConnection();
		String sql = "insert into student values(?,?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, student.getSno());
			ps.setString(2, student.getSname());
			ps.setInt(3, student.getSage());
			ps.setString(4, student.getAddress());
			int count = ps.executeUpdate();
			if(count>0)
				return true;
			else
				return false;
		} catch (SQLException e) {
			//e.printStackTrace();
			//return false;
			//注意返回值
			throw new RuntimeException(e);
		} finally {
			BaseDB.DBClose(conn, ps, rs);
			
		}
		

	}

	// 根据学号查学生
	public Student queryStudentByNo(int sno) {
		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection conn = BaseDB.getConnection();
		String sql = "select * from student where sno=?";
		Student student = new Student();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, sno);
			rs = ps.executeQuery();
			if (rs.next()) {
				int no = rs.getInt("sno");
				String name = rs.getString("sname");
				int age = rs.getInt("sage");
				String address = rs.getString("saddress");
				student.setSno(no);
				student.setAddress(address);
				student.setSage(age);
				student.setSname(name);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDB.DBClose(conn, ps, rs);
		}

		return student;
	}
}
