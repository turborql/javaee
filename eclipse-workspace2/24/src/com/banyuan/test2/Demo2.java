package com.banyuan.test2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
//void store(OutputStream out,String comments)
//void store(Writer writer,String comments)
//参数：
//OutputStream out:字节输出流，不能写中文
//Writer writer：字符输出流，可以写中文
//String comments：注释，用来解释说明保存的文件是做什么用的（不能使用中文，会产生乱码，默认Unicode编码，一般使用“”空字符串）
//使用步骤：1.创建Properties集合对象，添加数据
//2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
//3.使用Properties集合中的方法store,把集合中的临时数据，持久化写到硬盘中存储
//4.释放资源
public class Demo2 {
public static void main(String[] args) throws IOException {
	function1();
}
public static void function1() throws IOException {
	//1.创建Properties集合对象，添加数据
	Properties p=new Properties();
	p.setProperty("zhang", "20");
	p.setProperty("li", "22");
	p.setProperty("zhao", "21");
	//2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
	FileWriter fw=new FileWriter("a");
	p.store(fw, "save data");
}
}
