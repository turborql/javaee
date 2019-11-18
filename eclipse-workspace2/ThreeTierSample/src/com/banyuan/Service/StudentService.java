package com.banyuan.Service;

import com.banyuan.dao.StudentDao;
import com.banyuan.entity.Student;

//逻辑性的增删改查(增：查+增），对dao进行组装
public class StudentService {
	public boolean addStudent(Student student) {
		StudentDao studentDao=new StudentDao();
		if(studentDao.isExist(student.getSno())) {
			System.out.println("此人已存在");
			return false;
		}else {
			boolean flage=studentDao.addStudent(student);
			return flage;
		}
		
		
	}
}
