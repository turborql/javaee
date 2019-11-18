package com.banyuan.enity;

public class Login {
private int id;
private String uname;
private String upwd;
@Override
public String toString() {
	return "Login [id=" + id + ", uname=" + uname + ", upwd=" + upwd + "]";
}
public int getId() {
	return id;
}
public Login() {

}
public Login(String uname ,String upwd) {
	this.uname=uname;
	this.upwd=upwd;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpwd() {
	return upwd;
}
public void setUpwd(String upwd) {
	this.upwd = upwd;
}
}
