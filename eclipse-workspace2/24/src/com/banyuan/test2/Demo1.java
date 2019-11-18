package com.banyuan.test2;

import java.util.Properties;
import java.util.Set;

public class Demo1 {
public static void main(String[] args) {
	function1();
	//object setProperty(String key,String value)调用Hashtable的方法put
	//String getProperty(String key)通过key找到value值，此方法相当于Map集合中的get（key）方法
	//Set<String> StringPropertyNames()返回此属性列表中的键集，其中该键及其对应值是字符串，此方法相当于Map集合中的keySet方法
}
public static void function1() {
	//创建集合对象
	Properties p=new Properties();
	//使用setProperty往集合中添加数据
	p.setProperty("zhang", "20");
	p.setProperty("li", "22");
	p.setProperty("zhao", "21");
//	p.put(1, true);
	
	//使用StringPropertyNames把Properties集合中的键取出，存储到一个Set集合中
    Set<String> set=p.stringPropertyNames();
    //遍历set集合，取出Properties集合的每一个键
    for(String key:set) {
    	String value=p.getProperty(key);
    	System.out.print(value+",");
    }
}
}
