package com.banyuan.test2;

public class Maps implements Comparable {
private Integer key;
private String value;

public Integer getKey() {
	return key;
}
public void setKey(Integer key) {
	this.key = key;
}
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
public String toString() {
	return "[key="+key+"value"+value+"]";
}
public int compareTo(Object o) {
	Maps maps=(Maps)o;
	return maps.key-this.key;
}

}
