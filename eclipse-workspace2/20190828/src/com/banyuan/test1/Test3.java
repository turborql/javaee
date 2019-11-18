package com.banyuan.test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//效率更高
public class Test3 {
public static void main(String[] args) {
	BufferedWriter bw=null;
	try {
		bw=new BufferedWriter(new FileWriter("bbb"));
	} catch (IOException e) {
				e.printStackTrace();
	}
	try {
		bw.write("半圆学社");
	} catch (IOException e) {
				e.printStackTrace();
	}finally {
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
