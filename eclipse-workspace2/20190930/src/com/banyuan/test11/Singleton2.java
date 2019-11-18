package com.banyuan.test11;

public class Singleton2 {
private Singleton2() {
	
}
public static Singleton2 getInstance() {
	return Inner.instance;
	
}
private static class Inner{
	private static final Singleton2 instance=new Singleton2();
}

}
