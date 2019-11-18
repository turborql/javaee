package com.banyuan.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test2 {
	public static void main(String[] args) {
		try {
			//输出的文件名叫aaa,在这个文件里面写入sth,把这个字符串转成字符数组放到数组（给它一个空间）里面
			OutputStream os=new FileOutputStream("aaa");
			os.write("helloworld".getBytes());
//			byte[] b=new byte[1024];
			InputStream is=new FileInputStream("aaa");
		
			//1.read()重输入流读入下一个字节，所以用循环，而且字节肯定是>=0的
			/*int a=is.read();
			System.out.println("a="+(char)a);
			a=is.read();
			System.out.println("a="+(char)a);
			a=is.read();
			System.out.println("a="+(char)a);
			a=is.read();
			System.out.println("a="+(char)a);
			a=is.read();
			System.out.println("a="+(char)a);
			a=is.read();
			System.out.println("a="+(char)a);
			a=is.read();
			System.out.println("a="+(char)a);
			a=is.read();
			System.out.println("a="+(char)a);
			a=is.read();
			System.out.println("a="+(char)a);
			a=is.read();
			System.out.println("a="+(char)a);
			a=is.read();
			System.out.println("a="+a);*/
			//2.int read(byte[]b)将b.length个字节的数据读入一个byte数组中
			int len;
			byte[] b1=new byte[1024];
		while((len=is.read(b1))!=-1) {
//			System.out.print((char)len);
			System.out.println(new String(b1,0,len));
			
		}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

}
}
