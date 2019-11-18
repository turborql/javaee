package com.banyuan.wrapper;

public class StringDemo2 {
public static void main(String[] args) {
	String s1="abc";
	String s2=new String("abc");
	System.out.println("s1==s2:"+(s1==s2));//false
	System.out.println(s1.equals(s2));//true
	String s3=new String("abc");
	String s4="abc";
	String s5=s1+"";
	String s6="a"+"b"+"c";
	System.out.println("s1==s3:"+(s1==s3));//false
	System.out.println("s1==s4:"+(s1==s4));//true
	System.out.println("s1==s5:"+(s1==s5));//false
	System.out.println("s1==s5:"+(s1==s6));//true
}
}
