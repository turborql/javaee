package com.banyuan.test2;

public class Client {
public static void main(String[] args) {
	//真实的歌手
	Star real=new RealStar();
	//将真实的歌手传给代理类
	ProxyStar ps=new ProxyStar(real);
	ps.sing();
}
	
	
	
}
