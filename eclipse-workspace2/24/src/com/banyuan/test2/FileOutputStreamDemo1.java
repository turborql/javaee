package com.banyuan.test2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("a",true);
	fos.write("你好".getBytes());
	fos.close();
}
}
