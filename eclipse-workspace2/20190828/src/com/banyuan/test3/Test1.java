package com.banyuan.test3;
//static import  java.lang.System;报错
//import static java.lang.System;报错
//静态导入
import static java.lang.System.out;

import java.io.FileNotFoundException;
import java.io.PrintStream;
public class Test1 {
public static void main(String[] args) {
//	System.out out静态导入
	java.lang.System.out.print(1);//out--printStream的对象
	out.print(1);//静态导包，可以省略　System
//	PrintStream//字节流永远不会抛异常；自动刷新；在写入byte数组之后，可以自动调用fluash
//	PrintWrite//字符流
	//目前IO流没有无参构造方法
	PrintStream ps=null;
	try {
		ps=new PrintStream("cc");
		ps.print(true);//自动刷新
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}finally {
		if(ps!=null) {
			ps.close();
		}
	}
}
}
