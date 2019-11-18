package com.banyuan.test2;

public class Maps implements Comparable{
private String key;
private Integer value;
public String getKey() {
	return key;
}
public void setKey(String key) {
	this.key = key;
}
public Integer getValue() {
	return value;
}
public void setValue(Integer value) {
	this.value = value;
}
public Maps(String key, Integer value) {
	super();
	this.key = key;
	this.value = value;
}
public String toString() {
	return "[key="+key+",value="+value+"]";
}
@Override
public int compareTo(Object o) {
	Maps m=(Maps)o;
	return value-m.value;
	}
}
