package cmo.banyuan.test;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Test1 {
public static void main(String[] args) throws IOException {
	OutputStream os=new FileOutputStream("text.txt");
	os.write('1');
	os.write('0');
	os.write("你好".getBytes());
	os.write(1888);
	os.close();
	
}
}
