package com.entity;

import java.io.Serializable;
/**
 * 已销售书籍
 */
public class SellBook implements Serializable {
	private static final long serialVersionUID = 1L;
	private int sid;//编号
	private int bid;//书籍id
	private String sellbname;//书籍名称
	private double price;//单价
	private int sellAmount;//已售数量
	private double allprice;//总价格
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getSellbname() {
		return sellbname;
	}
	public void setSellbname(String sellbname) {
		this.sellbname = sellbname;
	}
	public int getSellAmount() {
		return sellAmount;
	}
	public void setSellAmount(int sellAmount) {
		this.sellAmount = sellAmount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAllprice() {
		return allprice;
	}
	public void setAllprice(double allprice) {
		this.allprice = allprice;
	}
}
