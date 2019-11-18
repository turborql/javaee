/**
 * 
 */
package com.banyuan.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import com.banyuan.dao.StudentDao;
import com.banyuan.entity.Student;
import com.banyuan.util.BaseDB;
import com.banyuan.util.JDBCUtil;
import com.banyuan.util.ResultSetDB;

/**
 * @author yw 2019年9月23日 上午9:32:10
 *
 */
public class StudentDaoImpl implements StudentDao {

	private BaseDB db = new BaseDB();

	private JDBCUtil jdbcutil = new JDBCUtil();
	
	
	private ResultSetDB resultSetDB = new ResultSetDB() {

		@Override
		public Vector<Student> getData(ResultSet rs) {
			Vector<Student> d = new Vector<>();
			try {
				while (rs.next()) {
//					Vector line = new Vector();
//					line.add(rs.getObject(1));
//					line.add(rs.getObject(2));
//					line.add(rs.getObject(3));
//					line.add(rs.getObject(4));
//					line.add(rs.getObject(5));
					
					Student student=new Student();
					student.setId(Integer.parseInt(String.valueOf(rs.getObject("id"))));
					student.setName(rs.getString("name"));
					student.setSex(rs.getString("sex"));
					student.setRoomid(rs.getInt("roomid"));
					student.setSex(rs.getString("tel"));
					

//					d.add(line);
					d.add(student);
				}
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return d;

		}

	};
	
	private ResultSetDB resultSetDB2 = new ResultSetDB() {

		@Override
		public Vector getData(ResultSet rs) {
			Vector d = new Vector();
			try {
				while (rs.next()) {
					Vector line = new Vector();
					line.add(rs.getObject(1));
					
					d.add(line);
				}
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return d;

		}

	};
	

	

	

	public void updateData(Student student) {

		String sql = "update stu_info1 set name=?,sex=?,roomid=?,tel=? where id=? ";
		jdbcutil.modify(sql, student.getName(), student.getSex(),student.getRoomid(),student.getTel(), student.getId());

	}

	public void insertData(Student student) {

		String sql = "insert into stu_info1(name,sex,roomid,tel) values(?,?,?,?)";

		jdbcutil.modify(sql, student.getName(),student.getSex(),student.getRoomid(),student.getTel());

	}

	public void deleteData(Student student) {
		String sql = "delete from stu_info1 where id=?";
		jdbcutil.modify(sql, student.getId());
	}
	
	
	public Vector getDataByName(int curPage, int count, Student student) {
		System.out.println("===StudentDaoImpl==getDataByName(int curPage, int count, Student student)==");
		
		Vector data = new Vector();

		String sql = "select * from stu_info1  where name like ?  limit ?,?";		

		data = jdbcutil.query(sql, resultSetDB, student.getName()+"%",(curPage - 1) * count, count);

		return data;
		
	}

	@Override
	public Vector<Student> getData(int curPage, int count) {
		
		System.out.println("===StudentDaoImpl==Vector getData(int curPage, int count)==");

		Vector<Student> data = new Vector<>();

		String sql = "select * from stu_info limit ?,?";
		
		data = jdbcutil.query(sql, resultSetDB, (curPage - 1) * count, count);

		return data;

	}

	@Override
	public List getStudentByProc(Student student) {
		List data = new Vector();

		String sql = "call querystudent3(?)";		

//		data = jdbcutil.query(sql, resultSetDB, student.getName()+"%",(curPage - 1) * count, count);

		data=jdbcutil.callProcedure(sql, resultSetDB2, student.getName());
		System.out.println("StudentDao==getStudentByProc==data="+data);
		return data;

//		return null;
	}

	@Override
	public int getSumPage(int count) {
		
		int sumPage=0;
		String sql = "select count(*) from stu_info ";
		
		Vector data = jdbcutil.query(sql, resultSetDB2);
		int sumCount=Integer.parseInt(String.valueOf(((Vector)data.get(0)).get(0)));
		if(sumCount%count==0) {
			sumPage=sumCount/count;
		}
		else {
			sumPage=sumCount/count+1;
		}
		
		return sumPage;
	}

}
