package com.banyuan.test4;

import java.io.File;

public class Test02 {
public static void main(String[] args) {
	File f=new File("e3");
	File [] sArr=f.listFiles();
	for(File s:sArr) {
		if(s.isDirectory()) {
			File[] sArr2=s.listFiles();
			for(File s2:sArr2) {
				System.out.println(s2.getName());
			}
		}
		System.out.println(s.getName());
	}
}
}
