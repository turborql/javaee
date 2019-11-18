package com.banyuan.test11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Readertest {
public static void main(String[] args) throws IOException {
	Reader r=new FileReader("e");
	int len=0;
	while((len=r.read())!=-1) {
		System.out.println((char)len);
	}
}
}
