package com.banyuan.test1;

import java.io.FileWriter;
import java.io.IOException;
//字节流，写一个贴一个
//字符流，所有写完再贴，效率快，并且由用户决定
public class Test03 {
public static void main(String[] args) {
	FileWriter fw=null;
	try {
		 fw=new FileWriter("aaa");
		fw.write("china中国");
//		System.out.println(1/0);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(fw!=null) {//完整性
			
			try {
				//没有这句话，“china中国”就没有写到文件中--没有刷新flush--close底层在调用flush
				//
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
