package com.banyuan.test6;

import java.util.Comparator;
//自定义一个类实现Comparator排序器,定制排序
public class Mycomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//score降序，name字典顺序
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.getScore()==s2.getScore()) {
			return s1.getName().compareTo(s2.getName());
		}
		return s2.getScore()-s1.getScore();
	}
	

}
