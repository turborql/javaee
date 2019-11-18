package com.banyuan.test1;
/*异常的处理方式：
try {
	被检测的代码（可能出现的代码）
}catch(异常类名 变量) {
	异常的处理方式
	循环，判断，调用方法，变量
}finally {
	必须要执行的代码
}*/

public class ExceptionDemo1 {
public static void main(String[] args) {
	int[] arr= null;
	try {
		int i=getArray(arr);
		System.out.println(i);
		}catch(NullPointerException ex){
			System.out.println(ex);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
	System.out.println("Gameover");
}
/*定义方法，抛出异常
 * 调用者使用try，catch
 */
public static int getArray(int[] arr)throws NullPointerException ,ArrayIndexOutOfBoundsException{
	//对数组判断空
	if(arr==null) {
		throw new NullPointerException("数组不存在");
	}
	if(arr.length<3) {
		throw new ArrayIndexOutOfBoundsException("数组没有3索引");
	}
	return arr[3]+1;
}
}
