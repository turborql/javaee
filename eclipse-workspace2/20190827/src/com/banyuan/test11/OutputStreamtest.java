package com.banyuan.test11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamtest {
	public static void main(String[] args) throws IOException {
		
//		File file=new File("d");
//		OutputStream os=new FileOutputStream(file);
		OutputStream os=new FileOutputStream("two");
		//第一种
		os.write(49);
		os.write(48);
		os.write(48);
		//第二种
		os.write('1');
		os.write('0');
		os.write('0');
		//第三种
		byte[] b= {65,66,67};
		os.write(b);
		//第四种
		os.write("你好".getBytes());
		
	}
}
