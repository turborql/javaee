package com.banyuan.test3;

public class Student {
private String name;
private int score;

public Student(String name,int score) {
	this.name=name;
	this.score=score;	
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setAge(int score) {
	this.score=score;
}
public int getScore() {
	return score;
}
@Override
public String toString() {
	return "Student [name=" + name + ", score=" + score + "]";
}


@Override//alt+/
public boolean equals(Object obj) {
	System.out.println("Student=========equals()");
//	return super.equals(obj);
	Student s=(Student)obj;
//	return this.name.equals(s.name);//这个只会判断新添加的值能不能被放入集合中，但是不会排序
     return true;//如果让返回值为true，就不会放入新的元素进入集合
}

@Override
public int hashCode() {//这里得改变return的值，不然的new出来的对象地址肯定是不一样的，永远都调用不到equals方法
	System.out.println("Student=====hashCode()");
//	return 87;//只要return的是int值就OK
	
	return name.hashCode();//因为name是字符串，所以可以使用hashCode（）值，并且String重写了Object的hashCode
	                       //s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
	
//	return super.hashCode();
	
}

/*Object的
 * public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 * */
}
