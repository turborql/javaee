package com.banyuan.test1;

import java.io.FileReader;

public class Test2 {
public static void main(String[] args) {
	try {
		FileReader fr=new FileReader("ab");
		char[] arr=new char[4];
		int len=0;
		while((len=fr.read(arr))!=-1) {
			//文件分割
			System.out.println(new String(arr,0,len));
		}
		
	}catch(Exception e) {
		
	}
	
}
}
