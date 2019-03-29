package com.shop.service;

import com.shop.dao.UserDao;
import com.shop.entity.Users;

public class UsersService implements UserDao{

	
	@Override
	public int addUser(Users user) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int editInfo(int uid, String name, String email) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int editPasswd(int uid, String passwd) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(int uid) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Users queryByName(String uname) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users queryByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
