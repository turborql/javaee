package com.banyuan.entity;

import java.util.Date;

public class Commodity {
//属性	
private String commidtyname;
private String commidtyid;
private String unit;
private double price;
private  int count ;
private Date warehousingtime ;//入库时间
private String expirationtime;//有效期

//getter setter
public String getCommidtyname() {
	return commidtyname;
}
public void setCommidtyname(String commidtyname) {
	this.commidtyname = commidtyname;
}
public String getCommidtyid() {
	return commidtyid;
}
public void setCommidtyid(String commidtyid) {
	this.commidtyid = commidtyid;
}
public String getUnit() {
	return unit;
}
public void setUnit(String unit) {
	this.unit = unit;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public Date getWarehousingtime() {
	return warehousingtime;
}
public void setWarehousingtime(Date warehousingtime) {
	this.warehousingtime = warehousingtime;
}
public String getExpirationtime() {
	return expirationtime;
}
public void setExpirationtime(String expirationtime) {
	this.expirationtime = expirationtime;
}
//tostring
@Override
public String toString() {
	return "Commodity [commidtyname=" + commidtyname + ", commidtyid=" + commidtyid + ", unit=" + unit + ", price="
			+ price + ", count=" + count + ", warehousingtime=" + warehousingtime + ", expirationtime=" + expirationtime
			+ "]";
}





}
