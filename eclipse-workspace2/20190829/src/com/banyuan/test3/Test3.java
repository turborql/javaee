package com.banyuan.test3;

import java.io.File;

//函数递归:函数自己调用自己
public class Test3 {
public static void main(String[] args) {
	File f=new File("e3");
	
}
public void test01(File f) {
	//强行返回
//	test01();
	if(f.isDirectory()) {
		File[] sArr=f.listFiles();
         for(File s:sArr) {
        	 test01(s);
//        	 System.out.println(s);
         }
	}else {
		System.out.println(f);
	}
	
}
}
