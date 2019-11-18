package com.banyuan.test1;

//final类不能被继承
public /* final */ class Myclass1 {
	//final 修饰的属性必须要赋值
	/*final*/  int b=1;
	//final方法不能被重写（说明父类中的方法不想被子类覆盖）
	public final void test01() {
		
	}
	public void test02() {
		//final修饰的局部变量声明和赋值可以分开
		final int a;
		a=1;
//		a=2;//error;
	}
	public void test03(final int c) {
		System.out.println("c="+c);
	}
	public void test04() {
		int a=1;
		test03(a);
	}
	public void test05(final Cat cat) {
//		System.out.println(c.getAge());error
		System.out.println(cat.getAge());
	}
	public void test06() {
		Cat c=new Cat();
		c.setAge(10);
		test05(c);
	}
	
}
