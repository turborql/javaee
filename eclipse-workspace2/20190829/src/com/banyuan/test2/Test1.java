package com.banyuan.test2;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

//propertise继承HsahTable
//既能输入，又能输出
public class Test1 {
public static void main(String[] args) {
	Properties p=new Properties();
//	p.put(1, "zhang");不建议使用
	p.setProperty("username", "zhangshan");
	System.out.println(p);
	System.out.println(p.getProperty("username"));//?
	try {
		p.list(new PrintStream("c"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}

}
