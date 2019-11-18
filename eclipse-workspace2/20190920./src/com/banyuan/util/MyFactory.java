package com.banyuan.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class MyFactory {

	private HashMap<String, Object> objects = new HashMap<>();

	public MyFactory() {
		Properties p = new Properties();

		try {
			p.load(new FileReader("object.txt"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Set<Entry<Object, Object>> s = p.entrySet();
		Iterator<Entry<Object, Object>> it = s.iterator();

		while (it.hasNext()) {
			Entry<Object, Object> e = it.next();

			String key = String.valueOf(e.getKey());
			String value = String.valueOf(e.getValue());

			Object obj = null;

			try {
				Class c1 = Class.forName(value);
				obj = c1.newInstance();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			objects.put(key, obj);
		}

	}

	public  Object getInstance(String name) {
		return objects.get(name);
	}
}
