package com.banyuan.test1;

public class Test {
	public static void main(String[] args) {
		//将字符串转换到字符数组
		String str="helloworld";
		char[] array=str.toCharArray();
		for(char c:array) {//for(数据类型 变量名 ：数组名)-->遍历这个数组
			System.out.print(c+",");//直接打印变量
		}
		System.out.println();
		//检查序列的单个字符charAt(int index)
		char a=str.charAt(0);
		System.out.println("a="+a);
		//codePointAt（index）用法：单个字符所对应的int值
		int b=str.codePointAt(0);
		System.out.println("b="+b);//结果104
		/*以前的写法
		 * char c='h';
		int d=c;
		System.out.println("c="+c);
		System.out.println("d="+d);
		*/
		//compareTo用法  (分两种情况)
		String s1="abd";
		String s2="abcaa";
		System.out.println(s1.compareTo(s2));
	}
	
	
}
