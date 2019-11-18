package com.banyuan.test;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Address address;
	private List friend;
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", address=" + address + ", friend=" + friend + "]";
	}
	public List getFriend() {
		return friend;
	}
	public void setFriend(List friend) {
		this.friend = friend;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
