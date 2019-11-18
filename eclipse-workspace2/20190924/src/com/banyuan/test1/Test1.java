package com.banyuan.test1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test1 {
public static void main(String[] args) throws IOException {
//工厂 生产对象 创建对象 new对象
//	BufferedReader br=new BufferedReader(new FileReader("object.txt"));
//	String name=br.readLine();
	
	Properties p=new Properties();
	p.load(new FileReader("object.txt"));
	//集合知识
	String key="car";
	String value=p.getProperty(key);
	MyFactory mf=new MyFactory();
	Object obj=mf.createObject(value);
	System.out.println("obj="+obj);	
}
}
