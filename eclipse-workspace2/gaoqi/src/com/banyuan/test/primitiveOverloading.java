package com.banyuan.test;

public class primitiveOverloading {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/**
		 * 测试涉及基本类型的重载
		 */

		System.out.println("char类型重载：");
		char x = 'x';
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
		System.out.println("");
		System.out.println("byte类型重载：");
		byte y = 0;
		f1(y);
		f2(y);
		f3(y);
		f4(y);
		f5(y);
		f6(y);
		f7(y);
		System.out.println("");
		System.out.println("short类型重载：");
		short z = 0;
		f1(z);
		f2(z);
		f3(z);
		f4(z);
		f5(z);
		f6(z);
		f7(z);

		System.out.println("");
		System.out.println("int类型重载：");
		int z1 = 0;
		f1(z1);
		f2(z1);
		f3(z1);
		f4(z1);
		f5(z1);
		f6(z1);
		f7(z1);

		System.out.println("");
		System.out.println("long类型重载：");
		long z11 = 0;
		f1(z11);
		f2(z11);
		f3(z11);
		f4(z11);
		f5(z11);
		f6(z11);
		f7(z11);

		System.out.println("");
		System.out.println("float类型重载：");
		float z111 = 0;
		f1(z111);
		f2(z111);
		f3(z111);
		f4(z111);
		f5(z111);
		f6(z111);
		f7(z111);

		System.out.println("");
		System.out.println("double类型重载：");
		float z1111 = 0;
		f1(z1111);
		f2(z1111);
		f3(z1111);
		f4(z1111);
		f5(z1111);
		f6(z1111);
		f7(z1111);

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
	};

	public static void f1(double x) {
		System.out.print("f1(double)");
	};

	public static void f2(byte x) {
		System.out.print("f2(byte)");
	};

	public static void f2(short x) {
		System.out.print("f2(short)");
	};

	public static void f2(int x) {
		System.out.print("f2(int)");
	};

	public static void f2(long x) {
		System.out.print("f2(long)");
	};

	public static void f2(float x) {
		System.out.print("f2(float)");
	};

	public static void f2(double x) {
		System.out.print("f2(double)");
	};

	public static void f3(short x) {
		System.out.print("f3(short)");
	};

	public static void f3(int x) {
		System.out.print("f3(int)");
	};

	public static void f3(long x) {
		System.out.print("f3(long)");
	};

	public static void f3(float x) {
		System.out.print("f3(float)");
	};

	public static void f3(double x) {
		System.out.print("f3(double)");
	};

	public static void f4(int x) {
		System.out.print("f4(int)");
	};

	public static void f4(long x) {
		System.out.print("f4(long)");
	};

	public static void f4(float x) {
		System.out.print("f4(float)");
	};

	public static void f4(double x) {
		System.out.print("f4(double)");
	};

	public static void f5(long x) {
		System.out.print("f4(long)");
	};

	public static void f5(float x) {
		System.out.print("f5(float)");
	};

	public static void f5(double x) {
		System.out.print("f5(double)");
	};

	public static void f6(float x) {
		System.out.print("f6(float)");
	};

	public static void f6(double x) {
		System.out.print("f6(double)");
	};

	public static void f7(double x) {
		System.out.print("f7(double)");
	};

}
