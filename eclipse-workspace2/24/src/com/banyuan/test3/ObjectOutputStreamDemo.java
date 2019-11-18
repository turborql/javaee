package com.banyuan.test3;

import java.io.*;

//对象的序列化流，使用字节流
public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		// 1.创建ObjectOutputStream对象，构造方法中传递字节输出流
//		FileOutputStream fs=new FileOutputStream("a");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("c"));
			// 2.使用ObjectOutputStream对象中的方法writeObject()，把对象写入文件中
			oos.writeObject(new Person("肖战", 20));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();// 3.释放资源
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
