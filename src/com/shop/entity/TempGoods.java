package com.shop.entity;

public class TempGoods {
	private Goods goods;
	private int number;
	
	public TempGoods() throws Exception{}
	public Goods getGoods() {
		return this.goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
