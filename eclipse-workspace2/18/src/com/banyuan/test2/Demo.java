package com.banyuan.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		function();
	}

	public static void function() {
		Collection coll = new ArrayList();
		coll.add("abc");
		coll.add("cd");
		Iterator it = coll.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}

}
