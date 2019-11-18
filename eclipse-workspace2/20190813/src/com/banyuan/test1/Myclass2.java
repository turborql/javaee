package com.banyuan.test1;

public class Myclass2 extends Myclass1 {
	//test1();这一行有多个标记——该方法需要一个主体而不是分号——该方法缺少返回类型

	public void test1() {
		System.out.println("Myclass2=======test1");
	}
		public void test2() {
////			super.test1();
			super.test1();//就近原则	
		}
}



