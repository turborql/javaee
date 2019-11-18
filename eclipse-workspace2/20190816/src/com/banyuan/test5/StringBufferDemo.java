package com.banyuan.test5;

public class StringBufferDemo {
/*StringBuffer类方法
 * append，将任意类型的数据，添加缓冲区
 * append 返回值是StringBuffer，写return this
 * 调用者是谁，返回值就是谁
 * */
	/*delete（int start,int end)删除缓冲区字符
	 * 开始索引包含，结尾索引不包含
	 */
	/*
	 * insert(int index,任意类型）将任意类型数据，插入到缓冲区的指定索引上
	 */
	/*
	 * replace(int start,int end,String str)将指定的索引范围内的所有字符，替换成新的字符串
	 */
	/*
	 * reverse（）将缓冲区中的字符反转
	 */
	/*
	 * 返回值String;toString()继承Object，重写toString()
	 * 将可变的字符串缓冲区对象，变成了不可变String对象
	 */
	public static void main(String[] args) {
			function();
	}
public static void function(){
	StringBuffer buffer =new StringBuffer();
	//调用StringBuffer方法append向缓冲区追加内容
	buffer.append(6).append(false).append(1);//方法调用链
	System.out.println(buffer);
}
}
