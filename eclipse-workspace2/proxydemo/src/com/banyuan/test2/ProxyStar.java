package com.banyuan.test2;

public class ProxyStar implements Star{
//接口指向实现类
	private Star star;
//使用构造方法将star传进来
	public ProxyStar(Star star) {
		this.star=star;
	}
	@Override
	public void confer() {
		System.out.println("proxy--confer");
	}

	@Override
	public void signContract() {
		System.out.println("proxy-singContract");
	}

	@Override
	public void bookTicket() {
		System.out.println("proxy-bookTicket");
	}

	@Override
	//代理类唯一不能做的就是唱歌，所以此时必须有一个真实的歌手来唱歌
	public void sing() {
		star.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("proxy-collectMoney");
	}

}
