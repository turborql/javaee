package com.banyuan.test1;

public class Exception2 {

	public static void main(String[] args) {
		try{
			function(0);
		}catch(Exception ex) {
			System.out.println(ex);
		}finally {
			System.out.println("代码必须执行");
		}

	}
	public static void function(int a)throws Exception{
		if(a==0) {
			System.out.println(a);
			throw new Exception();
			
		}
	}

}
