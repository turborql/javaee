/**
 * 
 */
package com.banyuan.entity;

/**
 * @author yw
 * 2019年9月23日  上午9:28:46
 *
 */
public class Student {
	private int id;
	private String name;
	private int roomid;
	private String tel;
	private String sex;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roomid=" + roomid + ", tel=" + tel + ", sex=" + sex + "]";
	}
	public int getId() {
		return id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	

}
