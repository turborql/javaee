package com.banyuan.test2;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
public static void main(String[] args) {
	function1();
}
/*1.public boolean creatNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
 * 创建文件但路径和名称在构造方法中给出（构造方法的参数）
 * 返回boolean值
 * true：文件不存在，创建文件，返回true
 * false：文件存在，不会创建，返回false
 * 注意：
 * 1.此方法只能创建文件，不能创建文件夹
 * 2.创建文件的路径必须存在，否则会抛出异常
 * 
 * public boolean createNewFile() throws IOException 
 * createNewfile声明抛出了IOException异常，我们调用中国方法，就必须处理中国异常，要么throws，要么trycatch
 * */
public static void function1() {
	File f=new File("e");
	try {
		boolean b=f.createNewFile();
		System.out.println(b);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}

/*3.public boolean mkdir():创建由此File表示的目录
 * 只能创建单级空文件夹
 * */
/*4.public boolean mkdirs():创建由此File表示的目录，包括任何必须但不存在但父目录
 * 既可以创建单级文件夹，也可以创建多级文件夹
 * */
/*创建文件夹的路径和名称在构造方法中给出（构造方法的参数）
 * 返回值：布尔值
 * true：文件夹不存在，创建文件夹，返回true
 * false：文件夹存在，不会创建，返回false；构造方法中给出的路径不存在返回false
 * 注意：此方法只能创建文件夹，不能创建文件
 */

}
/*2.public boolean delete():删除由此File表示的文件或目录
 * */

 