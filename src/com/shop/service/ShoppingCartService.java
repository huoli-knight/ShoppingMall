package com.shop.service;

import java.util.Vector;

import com.shop.dao.ShoppingCartDao;
import com.shop.entity.ShoppingCart;
public class ShoppingCartService implements ShoppingCartDao{

	@Override
	public Vector<ShoppingCart> getAllGoods(int uid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteGoods(int gid, int uid) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll(int uid) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
