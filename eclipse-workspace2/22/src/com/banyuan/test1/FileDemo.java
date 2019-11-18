package com.banyuan.test1;

import java.io.File;

public class FileDemo {
//File类静态成员变量
	public static void main(String[] args) {
		//与系统有关的路径分隔符号
		String Separator=File.pathSeparator;
		System.out.println(Separator);//:表示目录分隔linux中
		//与系统有关的默认名称分隔符号
		String Separator1=File.separator;
		System.out.println(Separator1);//   /目录名称分隔符
	}
	
}
