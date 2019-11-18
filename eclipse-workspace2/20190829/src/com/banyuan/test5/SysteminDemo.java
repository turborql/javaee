package com.banyuan.test5;

import java.io.IOException;
import java.io.InputStream;

public class SysteminDemo {
public static void main(String[] args) throws IOException {
	InputStream i=System.in;
	System.out.println(i.read());
}
}
