package com.banyuan.test3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
public static void main(String[] args) {
	ObjectInputStream ois=null;
	try {
		//1.创建ObjectInputStream对象，构造方法中传递字节输入流
		ois=new ObjectInputStream(new FileInputStream("c"));
		//2.使用readObject（）方法读取保存对象的文件　
		Object o=ois.readObject();
		//4.打印读取的对象
		System.out.println(o);
		Person p=(Person)o;
		System.out.println(p.getName()+","+p.getAge());
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}finally {
		if(ois!=null) {
			try {
				//3.释放资源
				ois.close();		
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
	
}
