package com.banyuan.test;

public class Test1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double x = 0;
		f1((float) x);
		f1((long) x);
		f1((int) x);
		f1((short) x);
		f1((byte) x);
		f1((char) x);
	}

	public static void f1(char x) {
		System.out.print("f1(char)");
	};

	public static void f1(byte x) {
		System.out.print("f1(byte)");
	};

	public static void f1(short x) {
		System.out.print("f1(short)");
	};

	public static void f1(int x) {
		System.out.print("f1(int)");
	};

	public static void f1(long x) {
		System.out.print("f1(long)");
	};

	public static void f1(float x) {
		System.out.print("f1(float)");
	}

}
