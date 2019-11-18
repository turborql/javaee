package com.banyuan.test1;

public class Test {
	public static void main(String[] args) {
		Myclass1 mc = new Myclass2();
		Myclass1 m1 = new Myclass3();

//		mc.test1();// 如果子类重写（覆盖）了父类的方法，那么打印的就是子类的；反之打印父类
//		mc.test2();
		Myclass4 m = new Myclass4();
//		m.print(mc);
		m.print(mc);
		m.print(m1);
	}

}
