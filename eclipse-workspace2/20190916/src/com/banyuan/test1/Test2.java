package com.banyuan.test1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
 
public class Test2 {  
public static void main(String[] args) {
	try { 
		System.out.println("client");
		Socket s=new Socket("192.168.10.246",10002);
	    OutputStream os= s.getOutputStream();
	    PrintWriter pw=new PrintWriter(os,true);
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
//	    pw.print("hello");
	    pw.print(str); 
	    
	} catch (IOException e) {
		e.printStackTrace();
	} 
	
}
}
