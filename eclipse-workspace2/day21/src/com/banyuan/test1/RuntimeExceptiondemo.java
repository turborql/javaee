package com.banyuan.test1;

public class RuntimeExceptiondemo {
public static void main(String[] args) {
		function();	
}
public static void function() {
	throw new RuntimeException();
}
}
