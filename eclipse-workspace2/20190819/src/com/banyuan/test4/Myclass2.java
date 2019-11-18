package com.banyuan.test4;

public class Myclass2 extends Myclass1{
	//子类必须重写父类没有重写的抽象方法，因为父类此时实现了接口
	public  int compare(Object obj1,Object obj2) {
		Person p1=(Person)obj1;
	
		Person p2=(Person)obj2;
		
		if(p1.getScore()==(p2.getScore())) {
			if(p1.getAge()==p2.getAge()) {
				return p1.getName().compareTo(p2.getName());
			}else {
				return p1.getAge()-p2.getAge();
			}
		}else {
			return p2.getScore()-p1.getScore();
		}
	
		
//		return 0;
	}
}
