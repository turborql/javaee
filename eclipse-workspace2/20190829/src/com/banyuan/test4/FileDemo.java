
package com.banyuan.test4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) {
//File file=new File(new File("e3"));
//		File file1=new File("e3","e4");
		File file2=new File("./e3/e4","e8");
		try {
			FileOutputStream fos=new FileOutputStream(file2);
			fos.write("hello".getBytes());
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		System.out.println(file2);//重写了toString
//		file2.mkdirs();
//		file1.mkdirs();
		try {
			file2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
