package com.banyuan.test11;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {
public static void main(String[] args) throws IOException {
	Writer w=new FileWriter("e");
	w.write(100);
	w.flush();
	
	char[] c= {'a','b'};
	w.write(c,0,1);
	w.flush();
	
	
	w.write("china中国");
	w.close();
	
}
}
