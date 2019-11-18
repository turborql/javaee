package com.banyuan.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("a", 2);
		hm.put("b", 3);
		hm.put("c", 1);
		hm.put("d", 2);
		TreeSet set = new TreeSet();
		Set st = hm.keySet();
		Iterator it = st.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			String key = String.valueOf(obj);
			Integer value = Integer.valueOf(String.valueOf(hm.get(key)));
			set.add(new Maps(key, value));
		}
		System.out.println(set);

	}

}
