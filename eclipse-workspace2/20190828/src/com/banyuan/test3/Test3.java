package com.banyuan.test3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		try {
			PrintStream out1=System.out;
			System.setOut(new PrintStream("eee"));
			System.out.println("hello");
			System.setIn(new FileInputStream("eee"));
			Scanner sc=new Scanner(System.in);
			String line=sc.nextLine();
			System.setOut(out1);
			System.out.println("line="+line);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//重定向
	}

}
