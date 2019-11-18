/**
 * 
 */
package com.banyuan.service;

import java.util.Vector;

import com.banyuan.entity.Student;
import com.banyuan.util.BaseDB;

public interface StudentService {
	
	//逻辑
	public Vector getData(int curPage, int count) ;
	
	public Vector getDataByName(int curPage, int count, Student student);

}
