package com.banyuan.test4;

import java.io.File;

public class Test03 {
	public static void main(String[] args) {
		int i = 0;
		File f = new File("e3");
		new Test03().test01(f,i);
	}

	public void test01(File f,int i) {
		// 函数递归,通过参数的返回值
//	test01();
//	File f=new File("e3");//就等于参数File f
		
		for(int j=0;j<i;j++) {
			System.out.print("-");
		}
		System.out.println(f.getName());
		if (f.isDirectory()) {
			File[] sArr = f.listFiles();
			for (File s : sArr) {
//			System.out.println(s.getName());
//			System.out.println(s);
//				System.out.print("-");
				test01(s,i+1);
//				System.out.println("　s=" + s);//两句话都会执行
			}
		}
//	else {
//		System.out.println("f="+f);
//	}
	}
//return;
}
