package com.banyuan.test;

public class Goods {
Good [] good =new Good[3];
public void initial() {
	good[0]=new Good("苹果",90,22);
	good[1]=new Good("laolishi",99,99);
	good[2]=new Good("s",2,2);
}
public void info() {
	for(Good g:good) {
		g.show();
	}
}
}
