package com.banyuan.test2;
/*注意：list方法和listFile方法遍历的是构造方法中给出的目录
 * 如果构造方法中给出的目录的路径不存在，会抛出空指针异常
 * 如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
 * 可以获取到隐藏的文件或文件夹名称
 * */
import java.io.File;

//File类遍历文件夹（目录）功能
public class FileDemo5 {
public static void main(String[] args) {
	function1();
}
/*1.public String list():返回一个String数组，表示File目录中的所有子文件或目录
 * 遍历构造方法中给出的目录，会获取目录中所有文件/文件夹的空名称，把获取到的多个名称存储到一个String类型的数组中
 */
public static void function1() {
	File f=new File("a");
	String[] arr=f.list();
	for(String filename:arr) {
		System.out.println(filename);// java.lang.NullPointerException
	}
}
/*2.public File listFiles():返回一个File数组，表示File目录中的所有子文件或目录
 * 遍历构造方法中给出的目录，会获取目录中所有文件/文件夹，把文件/文件夹封装为File对象，把多个File对象存储到File类型的数组中
 */
public static void function2() {
	File f=new File("a");
	File[] files=f.listFiles();
	for(File f1:files) {
		System.out.println(f1);
	}
}
}

 