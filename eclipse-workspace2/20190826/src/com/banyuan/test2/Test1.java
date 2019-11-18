package com.banyuan.test2;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Test1 {
public static void main(String[] args) {
	TreeMap<Integer,String> tm=new TreeMap<>(new Mycomparator());
	tm.put(1, "hello");
	tm.put(10, "world");
	tm.put(5, "china");
	System.out.println(tm);
	Set<Map.Entry<Integer,String>> set=tm.entrySet();
	Iterator<Map.Entry<Integer,String>> it=set.iterator();
	while(it.hasNext()) {
		Map.Entry<Integer,String> entry=it.next();
		Integer key=entry.getKey();
		String value =entry.getValue();
		System.out.println("key="+key+","+"value="+value);
	}
}
}
