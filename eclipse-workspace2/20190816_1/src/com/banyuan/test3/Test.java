package com.banyuan.test3;
public class Test {
	public static void main(String[] args) {
		try {
			int[] a = {};
			test1(a);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
public static void test1(int[] m) throws IndexOutOfBoundsException {
		if (m.length == 0) {
			throw new IndexOutOfBoundsException("数组越界异常");
		}
	}
}
