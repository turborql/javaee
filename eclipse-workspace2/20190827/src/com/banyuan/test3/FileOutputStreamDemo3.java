package com.banyuan.test3;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo3 {
//try外声明变量，try里面建立对象（作用域问题）
	public static void main(String[] args) {
		File file=new File("ddd");
		OutputStream os=null;
		try {
		 os=new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

}
