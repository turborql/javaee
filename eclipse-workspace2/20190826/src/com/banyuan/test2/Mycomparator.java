package com.banyuan.test2;

import java.util.Comparator;

public class Mycomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer key1=(Integer)o1;
		Integer key2=(Integer)o2;
		return key2-key1;
	}

}
