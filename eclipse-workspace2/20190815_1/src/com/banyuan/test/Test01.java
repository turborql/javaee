package com.banyuan.test;

public class Test01 {
	public static void main(String[] args) {
		Person p = new Person();
//		try {
 //			p.setAge(1000);//单写这句话-->Unhandled exception type Exception
//		}catch(Exception e){		
//		}	
		try{
			p.setAge(1000);
//			System.out.println(p.getAge());//出现异常就执行不到这句话，所以把它放在finally里面打印
		}catch (Exception e){
			
			System.out.println(e.getMessage());
		}finally {
			System.out.println(p.getAge());
		}
	} 
}
