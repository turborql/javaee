package com.banyuan.test1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Test3 { 
	public static void main(String[] args) {
		try {
			Socket s=new Socket("127.0.0.1",10000);
		    OutputStream os= s.getOutputStream();
		    PrintWriter pw=new PrintWriter(os,true);
		    Scanner sc=new Scanner(System.in);
		    String str=sc.nextLine();
//		    pw.print("hello"); 
		    pw.print(str);
		    
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
