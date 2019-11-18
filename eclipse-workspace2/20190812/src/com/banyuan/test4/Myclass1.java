package com.banyuan.test4;

public class Myclass1 {
	//private default protectd private
	//本类  同包  子类(包含同包和非同包)  其他
	private String name;
	int age;
	protected String sex;
	public String course;

	public void test() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
		System.out.println(course);
	}
}
