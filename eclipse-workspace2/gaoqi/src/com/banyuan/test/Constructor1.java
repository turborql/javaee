package com.banyuan.test;

public class Constructor1 {
Constructor1(){
	System.out.println("创建一个对象");
}
Constructor1(String s){
	System.out.println(s);
}
public static void main(String[] args) {
	Constructor1 c=new Constructor1();
	Constructor1 c1=new Constructor1("有参数构造方法");
}
}
