package com.banyuan.entity;

public class Student {
private int sno;
private String sname;
private int sage;
private String address;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getSage() {
	return sage;
}
public void setSage(int sage) {
	this.sage = sage;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Student(int sno, String sname, int sage, String address) {
	this.sno = sno;
	this.sname = sname;
	this.sage = sage;
	this.address = address;
}
public Student() {
	super();
	
}

}
