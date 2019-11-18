package com.banyuan.test2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Copy {
public static void main(String[] args) {
	Writer w=null;
	Reader r=null;
	try {
		w=new FileWriter("a");
		r=new FileReader("1");
		char[] c=new char[5];
		int len=0;
		while((len=r.read(c))!=-1) {
			w.write(c,0,len);
//		w.write(c);
			System.out.println(new String(c));
			w.flush();
		}
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
}
