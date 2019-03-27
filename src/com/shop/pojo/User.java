package com.shop.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable{
	private String username = "";
	private String passwd = "";
	private String confirdPasswd = "";
	Map<String, String> userMap = null;
	Map<String, String> errorsMap = null;
	public User() {
		super();
		this.username = "";
		this.passwd = "";
		userMap = new HashMap<String, String>();
		errorsMap = new HashMap<String, String>();
		userMap.put("abc", "abc");
		userMap.put("def", "def");
		userMap.put("qwe", "qwe");
		userMap.put("poi", "poi");
		userMap.put("hjk", "hjk");
	}
	public boolean isValidate() {
		boolean flag = true;
		if(!this.userMap.containsKey(this.username)) {
			flag = false;
			errorsMap.put("username", "该用户不存在!");
			this.username = "";
		}
		String password = this.userMap.get(this.username);
		if(password==null||!password.equals(this.passwd)) {
			flag = false;
			this.passwd = "";
			errorsMap.put("passwd", "密码错误，请输入正确密码!");
			this.username = "";
		}
		return flag;
	}
	public boolean registerValidate() {
		if(this.passwd == this.confirdPasswd) {
			errorsMap.put("confirdPasswd", "重新确认密码");
			return false;
		}
		userMap.put(this.username, this.passwd);
		return true;
	}
	public String getErrors(String key) {
		String errorV = this.errorsMap.get(key);
		return errorV == null?"":errorV;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}
