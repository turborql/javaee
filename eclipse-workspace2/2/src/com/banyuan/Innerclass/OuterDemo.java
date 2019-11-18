package com.banyuan.Innerclass;

public class OuterDemo {
	private String name;

	public void show() {

	}
//因为内部类访问外部类的私有成员更加方便
	class Inner {//OuterDemo类的成员
		 //String name;//Inner类的私有成员，这个成员只能在Inner类中使用
		void   fun(){
			  System.out.println("name:"+name);
		  }
	}
}
