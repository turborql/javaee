package com.banyuan.test1;

public class StringDemo2 {
	/*通过使用平台的默认字符集解码指定的byte数组，构造一个新的String
	 * 平台：机器操作系统
	 * 默认字符集：操作系统中的默认编码表GBK，一个汉字2个字节
	 * 将字节数组中的每个字节，查询编码表，得到的结果
	 * 字节是负数--GBK；正数--ASCII
	 * */
public static void main(String[] args) {
	function();
}
//1.String(byte[] bytes)传递字节数组
public static void function() {
	byte[] bytes= {97,98,99,100};
	String s=new String(bytes);
	System.out.println(s);
}
}
