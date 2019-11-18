package cmo.banyuan.test;

public class WeddingCompany implements Wedding{
private Wedding per;//接口作为属性
 public WeddingCompany(Wedding per) {
	 this.per=per;//将局部变量赋值给成员变量
 }
public void show() {
	System.out.println("准备布置婚礼各种事项");
}
	@Override
	public void mery() {
		per.mery();
		show();
		after();
		
	}
	public void after() {
		System.out.println("收拾");
	}

}
