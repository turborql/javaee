//反序列化
package com.banyuan.test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//谁动了你动奶酪，可以控制自定义类的版本
public class Test3 {
public static void main(String[] args) {
	ObjectInputStream ois=null;
	FileInputStream fs=null;
	try {
		fs=new FileInputStream("b") ;
		ois=new ObjectInputStream(fs);
		Object obj=ois.readObject();
		Person p=(Person)obj;
		int len=0;
		while((len=fs.available())>0){
		System.out.println(fs.available());
			p=(Person)ois.readObject();
			System.out.println(p.getName()+","+p.getAge());			
		}
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}finally {
		try {
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
