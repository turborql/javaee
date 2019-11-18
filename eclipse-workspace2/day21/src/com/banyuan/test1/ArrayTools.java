package com.banyuan.test1;

public class ArrayTools {

	public static void main(String[] args) {
	int[] arr= {1,2,3}; 
	int i=getArray(arr);
	System.out.println(i);
	}
	public static int getArray(int[] arr) {
		int i=arr[3];//arr[3]没有这个索引，jvm能够检测到出现数组到越界问题 
		return i+1;
	}

}
