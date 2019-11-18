package com.banyuan.test1;

import java.io.Serializable;

public class Person implements Serializable {
   /**
	 * 只要版本改变了，反序列化就会报错，所以可以控制版本
	 */
	private static final long serialVersionUID = 1L;//（private static final三个是平级的）
    private String name;
    transient private int age;//这个值不想被序列化
//   private String sex;
   
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
