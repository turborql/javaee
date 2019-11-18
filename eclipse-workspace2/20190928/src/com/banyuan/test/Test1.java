package com.banyuan.test;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Test1 {
public static void main(String[] args) throws FileNotFoundException {
	//zhangsan ,lisi,wangwu
	//zhaoliu,wangwu,lisi
	
	List<Person> list=new ArrayList<>();
	
	
	Person zhangsan=new Person();
	zhangsan.setId(1);
	zhangsan.setName("张三");
	Address a1=new Address();
	a1.setHomeAddress("nanjing");
	a1.setCompanyAddress("shanghai");
	zhangsan.setAddress(a1);
	
	Person lisi=new Person();
	lisi.setId(2);
	lisi.setName("李四");
	Address a2=new Address();
	a1.setHomeAddress("beijing");
	a1.setCompanyAddress("shanghai");
	lisi.setAddress(a2);
	
	
	Person wangwu=new Person();
	wangwu.setId(3);
	wangwu.setName("王五");
	Address a3=new Address();
	a1.setHomeAddress("hangzhou");
	a1.setCompanyAddress("shanghai");
	lisi.setAddress(a3);
	
	Person zhaoliu=new Person();
	zhaoliu.setId(4);
	zhaoliu.setName("赵六");
	Address a4=new Address();
	a1.setHomeAddress("beijing");
	a1.setCompanyAddress("nanjing");
	zhaoliu.setAddress(a4);
	
	Person xiaoli=new Person();
	xiaoli.setId(5);
	xiaoli.setName("小丽");
	Address a5=new Address();
	a1.setHomeAddress("hainan");
	a1.setCompanyAddress("shanghai");
	xiaoli.setAddress(a5);
	
	List<Person> list1=new ArrayList<>();
	list1.add(lisi);
	list1.add(zhaoliu);	
	zhangsan.setFriend(list1);
	
	list.add(zhangsan);
	Gson gson=new Gson();
	String result=gson.toJson(list);
	System.out.println(new PrintStream("person.json"));
	
	System.out.println(result);
}
}
