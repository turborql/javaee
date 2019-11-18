package com.banyuan.test1;

import java.io.File;

//File类的删除功能
//boolean delete()删除成功返回true，失败返回false
//删除的文件或文件夹，在File的构造方法中给出
public class FileDemo2 {
public static void main(String[] args) {
	function();
}
public static void function() {
	File file=new File("./a");
	boolean b=file.delete();
	System.out.println(b);
}
}
