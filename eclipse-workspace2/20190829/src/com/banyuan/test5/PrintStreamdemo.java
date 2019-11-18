package com.banyuan.test5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamdemo {
public static void main(String[] args) throws FileNotFoundException {
        File file=new File("aaa");
        PrintStream pw=new PrintStream(file);//FileNotFoundException
        pw.println(100);//100原样输出
        pw.write(100);//d走码表
        pw.close();
    }
}
	

