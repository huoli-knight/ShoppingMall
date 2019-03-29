package com.shop.dao;

import java.util.Vector;
import com.shop.entity.Goods;

public interface GoodDao {
	public int addGood(Goods good) throws Exception;
	public int deleteGood(int gid) throws Exception;
	public int updateGood(Goods good) throws Exception;
	public Vector<Goods> queryGoodBySid(int sid) throws Exception;
	public Vector<Goods> queryAll(String kinds) throws Exception;
}
