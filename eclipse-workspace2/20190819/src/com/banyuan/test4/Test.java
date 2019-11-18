package com.banyuan.test4;

public class Test {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("abc");
		p1.setAge(20);
		p1.setScore(100);
		
		Person p2=new Person();
		p2.setName("abc");
		p2.setAge(21);
		p2.setScore(90);
		Person p3=new Person();
		p3.setName("aaa");
		p3.setAge(20);
		p3.setScore(99);
		//给数组赋值
//		Person[] pArr=new Person[3];
		Object[] pArr=new Object[3];
		pArr[0]=p1;
		pArr[1]=p2;
		pArr[2]=p3;
		Myclass2 mc=new Myclass2();
		mc.sort(pArr);
		for(int i=0;i<pArr.length;i++) {
			Person p=(Person)pArr[i];
			System.out.println(p.getName()+","+p.getAge());
		}
		
	}

}
