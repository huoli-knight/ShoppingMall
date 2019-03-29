package com.shop.service;

import java.util.Vector;

import com.shop.dao.GoodDao;
import com.shop.entity.Goods;

public class GoodService implements GoodDao{

	@Override
	public int addGood(Goods good) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteGood(int gid) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateGood(Goods good) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vector<Goods> queryGoodBySid(int sid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Goods> queryAll(String kinds) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
