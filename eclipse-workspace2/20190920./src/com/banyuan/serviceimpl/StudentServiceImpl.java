package com.banyuan.serviceimpl;

import java.util.Vector;

import com.banyuan.entity.Student;
import com.banyuan.service.StudentService;
import com.banyuan.util.BaseDB;

public class StudentServiceImpl implements StudentService{
	                                                      //自己写一个异常
	public Vector getData(int curPage, int count) throws RuntimeException{
		BaseDB sdb=new BaseDB();
		//curPage范围可能会报异常
		
		return sdb.getData(curPage, count);
	}
	

}
