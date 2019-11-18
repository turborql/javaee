package com.banyuan.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.banuan.entity.Student;

public class StudentDB {
	public static void main(String[] args) {
		StudentDB studentdb = new StudentDB();
		List<Student> l = studentdb.queryAllStudent();
		System.out.println(l);
	}

	public List<Student> queryAllStudent() {
		ArrayList<Student> ls = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ql";
			String user = "root";
			String password = "Root_123";
			Connection conn;
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select id,name,age from student4";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Object o1 = rs.getObject(1);
				Object o2 = rs.getObject(2);
				Object o3 = rs.getObject(3);
//				System.out.println("====="+o2);
				Student stu = new Student();
				if (!(String.valueOf(o1).equals("null"))) {
					stu.setId(Integer.parseInt(String.valueOf(o1)));
				}
				stu.setName(String.valueOf(o2));

				if (!(String.valueOf(o1).equals("null"))) {
					stu.setAge(Integer.parseInt(String.valueOf(o3)));
				}

				ls.add(stu);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;

	}

	public void insert(String name, int age) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ql";
			String user = "root";
			String password = "Root_123";

			Connection conn = DriverManager.getConnection(url, user, password);
			String sql = "insert into student4(name,age) values(?,?)";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setObject(1, name);
			ps.setObject(2, age);
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
