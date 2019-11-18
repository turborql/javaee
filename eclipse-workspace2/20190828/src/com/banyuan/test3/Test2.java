package com.banyuan.test3;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Test2 {
public static void main(String[] args) {

	PrintWriter pw=null;
	try {
//		pw=new PrintWriter("dd");
		pw=new PrintWriter(new FileWriter("dd"),true);//自动刷新
		pw.print(3.14);
		pw.println(3.14);
//		pw.print(true);
//		pw.flush();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
//	}finally {
//		if(pw!=null) {
//			pw.close();//try...catch可以加可以不加
//		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
//标准输入，标准输出
}
