package com.banyuan.test1;
//序列化
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test2 {
public static void main(String[] args) {
	ObjectOutputStream oos=null;
	try {
		oos=new ObjectOutputStream(new FileOutputStream("b"));
		Person p=new Person();//实现序列化
		p.setAge(20);
		p.setName("zhangsan ");
		
		Person p2=new Person();
		p2.setAge(22);
		p2.setName("san ");
		
		Person p3=new Person();
		p3.setAge(10);
		p3.setName("zh ");
		oos.writeObject(p);
		oos.writeObject(p2);
		oos.writeObject(p3);
		
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
