package com.banyuan.entity;

import java.util.Date;

public class Commodity {
//属性	
private String commodityname;
private int commodityid;
private String unit;
private double price;
private  int count ;
private Date warehousingtime ;//入库时间
private String expirationtime;


//getter setter
public String getCommodityname() {
	return commodityname;
}
public void setCommodityname(String commodityname) {
	this.commodityname = commodityname;
}
public int getCommodityid() {
	return commodityid;
}
public void setCommodityid(int commodityid) {
	this.commodityid = commodityid;
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



@Override
public String toString() {
	return "Commodity (commodityname=" + commodityname + ", commodityid=" + commodityid + ", unit=" + unit + ", price="
			+ price + ", count=" + count + ", warehousingtime=" + warehousingtime + ", expirationtime=" + expirationtime
			+ ")";
}











}
