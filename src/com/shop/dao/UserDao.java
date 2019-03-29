package com.shop.dao;

import com.shop.entity.Users;

public interface UserDao {
	public int addUser(Users user) throws Exception;
	public int editInfo(int uid, String name, String email) throws Exception;
	public int editPasswd(int uid, String passwd) throws Exception;
	public int deleteUser(int uid) throws Exception;
	public Users queryByName(String uname) throws Exception;
	public Users queryByEmail(String email) throws Exception;
}
