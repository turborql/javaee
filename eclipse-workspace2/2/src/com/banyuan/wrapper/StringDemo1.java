package com.banyuan.wrapper;

public class StringDemo1 {
	public static void main(String[] args) {
		// 1.charAt(int index)获取指定位置上的字符
		String s = "hello";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + "\t"); // h e l l o
		}
		System.out.println();
		// 2.字符串具备比较大小的能力public int compareTo(String anotherString)
		System.out.println("abc".compareTo("abc"));// 0
		System.out.println("apple".compareTo("ap"));// 3
		System.out.println("abc".compareTo("bbc"));// -1对应位置不想等就是unicode相减
		// 3.String concat(String str)作用相当于加号
		s.concat("abc");
		System.out.println(s);// hello
		s = s.concat("abc");// 在常量池中产生一个新的字符串
		System.out.println(s);// helloabc

		// 4.boolean contains(CharSequence s)
		// 5.static String format(Locale l, String format, Object... args)占位符
		// 6.getBytes()将String类型转成byte类型的数组
		byte[] buf = s.getBytes();// 可以在网络中传输了
		for (byte b : buf) {
			System.out.print(b + "\t");
		}
		System.out.println();
		// 对方再将数组转成字符串显示
		String s1 = new String(buf, 0, buf.length);
		System.out.println(s1);
		// 7.int indexOf(int ch/String str)第一次出现位置
		System.out.println(s.indexOf("o"));// 4
		// 8.lastIndexOf(int ch)最后一次出现的位置
		// 9.length()字符串中的length（）
		// 10.String replace(char oldChar, char newChar)
//11.String substring(int beginIndex)
		// substring(int beginIndex, int endIndex)
		s = s.substring(1, 5);// 必须重新赋值给s
		System.out.println(s);// ello
//11.toCharArray()将字符串转char类型的数组
		char[] ch = s.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
//12.toLowerCase() toUpperCase()
		s = s.toUpperCase();
		System.out.println(s);
//13.trim（），去掉前后空格
		String s3 = "   hello  ";
		s3 = s3.trim();
		System.out.println(s3.length());// 5
//14.static valueOf()将各种数据类型转成String
		System.out.println(String.valueOf(new Integer(12)) + String.valueOf(new Integer(12)));// 1212
		System.out.println(new Integer(12) + new Integer(12));// 24
	}
}
