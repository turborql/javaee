package com.banyuan.test1;

public class GamePlayer implements IGamePlayer{
private String name;
	public GamePlayer(String name) {
	super();
	this.name = name;
}

	@Override
	public void login(String user, String password) {
		//这里有点不懂
		System.out.println("登录名为"+user+"的用户"+this.name+"登录成功");
		
	}

	@Override
	public void killBoss() {
		System.out.println(this.name+"在打怪");
		
	}

	@Override
	public void upgrade() {
		System.out.println(this.name+"又升了一级");
		
	}

}
