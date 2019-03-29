package com.shop.entity;

public class Users {
	private int uid;
	private String uname;
	private String passwd;
	private String email;
	
	public Users() throws Exception {}
	public Users(String uname, String passwd, String email) {
		this.uname = uname;
		this.passwd = passwd;
		this.email = email;
	}
	public int getUid() {
		return this.uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return this.uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassed() {
		return this.passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
