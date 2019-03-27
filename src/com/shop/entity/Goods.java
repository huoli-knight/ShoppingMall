package com.shop.entity;

public class Goods {
	private int gid;
	private String kinds;
	private String gname;
	private String gphoto;
	private float price;
	private float carriage;
	private String description;
	
	public Goods() throws Exception{}
	public Goods(int gid, String kinds, String gname, String gphoto, 
			float price, float carriage, String description) {
		this.gid = gid;
		this.kinds = kinds;
		this.gname = gname;
		this.gphoto = gphoto;
		this.price = price;
		this.carriage = carriage;
		this.description = description;
	}
	public int getGid() {
		return this.gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getKinds() {
		return this.kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	public String getGname() {
		return this.gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGphoto() {
		return this.gphoto;
	}
	public void setGphoto(String gphoto) {
		this.gphoto = gphoto;
	}
	public float getPrice() {
		return this.price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getCarriage() {
		return this.carriage;
	}
	public void setCarriage(float carriage) {
		this.carriage = carriage;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
