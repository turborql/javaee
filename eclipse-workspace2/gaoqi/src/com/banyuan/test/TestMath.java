package com.banyuan.test;
import static java.lang.Math.*;
public class TestMath {
public static void main(String[] args) {
	//在调用方法时，就不需要使用类名了，但容易产生歧义
	System.out.println(random());//默认调用本地，就近原则
	System.out.println(Math.random());
}
public static double random() {
	return 1;
}
}
