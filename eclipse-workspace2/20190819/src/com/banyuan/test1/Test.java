package com.banyuan.test1;

public class Test {
public static void main(String[] args) {
	//向上转型
	Dog a1=new Dog();
	String name;
	Animal a2=a1;
	//向下转型
	Dog a3=(Dog)a2;
	Cat b1=new Cat();
	Animal b2=b1;
//	Cat b3=(Cat)b2;
	//ClassCastException--编译时候没有报错，说明是RuntimeExcepiton
//	Cat b3=(Cat)a2;
	//对象 instanceof  类/接口
	if(a2 instanceof Cat) {
		Cat b3=(Cat)a2;
	}else if(a2 instanceof Dog) {
		Dog b3=(Dog)a2;
	}
	
}
} 
