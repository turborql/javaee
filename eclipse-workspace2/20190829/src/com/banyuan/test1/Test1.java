package com.banyuan.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1 {
public static void main(String[] args) {
	ObjectOutputStream oos=null;
	ObjectInputStream ois=null;
	try {
		oos =new ObjectOutputStream(new FileOutputStream("a"));
		oos.writeInt(100);
		oos.flush();//必须先刷新
		
		ois=new ObjectInputStream(new FileInputStream("a"));
		int line=ois.readInt();
		System.out.println(line);
		
	}catch(FileNotFoundException e){
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}finally {
		if(ois!=null) {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
		if(oos!=null) {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
}
