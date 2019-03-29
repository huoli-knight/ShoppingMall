package com.shop.dao;

import java.util.Vector;
import com.shop.entity.ShoppingCart;

public interface ShoppingCartDao {
	public Vector<ShoppingCart> getAllGoods(int uid) throws Exception;
	public int deleteGoods(int gid, int uid) throws Exception;
	public int deleteAll(int uid) throws Exception;
}
