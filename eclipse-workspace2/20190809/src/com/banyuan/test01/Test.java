package com.banyuan.test01;

public class Test {
public static void main(String[] args) {
//	Dog d=new dog();
	Dog.sex="male";
	Dog dog=new Dog();//左边先产生，右边后
	System.out.println(Dog.sex);//静态方法调用
	System.out.println(dog.sex);//new对象调用
}
}
