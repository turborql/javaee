package com.banyuan.test;

public class Person {
	private int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws RuntimeException {
		if (age > 0 && age < 120) {
			this.age = age;
		} else {
//		MyException e =new MyException();
			this.age = 10;
			throw new MyException("年龄不合法,赋默认值10");
//		this.age=10;//Unreachable code抛异常之后的语句不再执行
		}
	}

}
