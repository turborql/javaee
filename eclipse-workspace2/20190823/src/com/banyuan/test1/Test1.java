package com.banyuan.test1;

import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {
		//先看HashMap:void clear(),entrySet()内部类,v get(Oject key)(通过 key拿到v)
		//int size() 和 empty()
       //Set keySet(),put(k,v),v remove(object key)
		HashMap hm=new HashMap();
        hm.put(1, "china");
        hm.put(2, "USA");//排序{1=china, 2=USA}
		System.out.println(hm);//{}
	}

}
