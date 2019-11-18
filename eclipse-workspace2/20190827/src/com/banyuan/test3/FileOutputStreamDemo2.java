package com.banyuan.test3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo2 {

	public static void main(String[] args) {
		File file=new File("ddd");
		try {
//续写：FileOutputStream构造方法的第二个参数，加入true
			OutputStream os=new FileOutputStream(file,true);
			//回车换行，
		os.write("hello\r\n".getBytes());
		os.write("world".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
