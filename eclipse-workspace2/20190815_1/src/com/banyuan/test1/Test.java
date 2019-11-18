package com.banyuan.test1;
 
public class Test {

	public static void main(String[] args) {
		Person p=new Person();
//		try {
//		...
//		}catch(Exception e) {
//			System.out.println(e.getMessage());//加上注释，就不会调用自动（erro）的打印红色字体
//		}
		try {
			System.out.println("=========");
			p.setAge(100);
			System.out.println("*********");
			p.setSex("男1");
			
		}catch(SexException e) {
			System.out.println(e.getMessage());
		}catch(AgeException e) {
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
