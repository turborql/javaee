package com.banyuan.test1;

import java.io.File;

//File类的获取功能（查询）
public class FileDemo3 {
public static void main(String[] args) {
	File file=new File("./e/fd/fef");
//1.String getName()返回路径中表示的文件或文件夹名
//获取路径中的最后部分的名字
	String name=file.getName();//不管这个路径是否真实存在，只获取这个字符串的最后部分
	System.out.println(name);//fef
	//2.获取的是路径名getPath()
	String path=file.getPath();
	System.out.println(path);
	//3.File类获取功能
	//long length()返回路径中表示的文件的字节数（注意：只能获取文件不能是文件夹）
	
	//获取绝对路径
	//在eclipse环境中，File写的是一个相对路径，返回的绝对位置是工程根目录
	//4.String getAbsolutePath()
	//5.File getAbsolutePath()
	
	//获取父路径,没有的话返回null
	//6.String getParent()
	//7.File getParentFile()
}
}
