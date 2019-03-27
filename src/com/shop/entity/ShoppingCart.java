package com.shop.entity;

public class ShoppingCart {
	private int sid;
	private int gid;
	private int uid;
	private int number;
	
	public ShoppingCart() throws Exception{}
	public int getSid() {
		return this.sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getGid() {
		return this.gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getUid() {
		return this.uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
