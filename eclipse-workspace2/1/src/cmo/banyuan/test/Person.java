package cmo.banyuan.test;

public class Person implements Wedding{
	private String name;
	private String name2;
	public Person(String name,String name2) {
		this.name=name;
		this.name2=name2;
	}
@Override
public void mery() {
	System.out.println(name+"and"+name2+"结婚啦");
}
}
