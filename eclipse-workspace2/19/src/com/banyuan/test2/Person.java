package com.banyuan.test2;
//没有重写父类Object每次运行结果都是不同的整数
//如果子类重写父类的方法，哈希值，自定义的
//存储到HashSet集合的依据
public class Person {
	private String name;
	private int age;
	@Override
	public String toString() {
		
		return name+"..."+age;
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//重写hashCode()
public int hashCode() {
	return name.hashCode()+age;
}
@Override
public boolean equals(Object obj) {
	if(this==obj) {
		return true;
	}
	if(obj==null) {
		return false;
	}
	if(obj instanceof Person) {
		Person p=(Person)obj;
		return name.equals(p.name)&&age==p.age;
	}
	return false;
	
}
}
