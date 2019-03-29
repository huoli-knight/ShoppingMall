package com.shop.factory;

import com.shop.dao.GoodDao;
import com.shop.dao.ShoppingCartDao;
import com.shop.dao.UserDao;
import com.shop.service.GoodService;
import com.shop.service.ShoppingCartService;
import com.shop.service.UsersService;

public class DAOFactory {
	public static GoodDao getGoodDAOInstance() throws Exception {
		return new GoodService();
	}
	public static ShoppingCartDao getShoppingCartDAOInstance() throws Exception {
		return new ShoppingCartService();
	}
	public static UserDao getUserDAOInstance() throws Exception {
		return new UsersService();
	}
}
