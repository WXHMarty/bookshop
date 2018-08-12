package com.entity;

import java.io.Serializable;
/**
 * 销售统计类
 */
public class SellCensus implements Serializable {
	private static final long serialVersionUID = 1L;
	private int scid;
	private int purchaser_id;//购买者id
	private String purchaser;//购买者
	private int sellBook_id;//售出书籍id
	private String sellBook;//售出书籍
	private String sellTime;//购买时间
	private double price;//单价
	private int buyAmount;//售出数量

	public int getScid() {
		return scid;
	}
	public void setScid(int scid) {
		this.scid = scid;
	}
	public int getPurchaser_id() {
		return purchaser_id;
	}
	public void setPurchaser_id(int purchaser_id) {
		this.purchaser_id = purchaser_id;
	}
	public int getSellBook_id() {
		return sellBook_id;
	}
	public void setSellBook_id(int sellBook_id) {
		this.sellBook_id = sellBook_id;
	}
	public String getPurchaser() {
		return purchaser;
	}
	public void setPurchaser(String purchaser) {
		this.purchaser = purchaser;
	}
	public String getSellTime() {
		return sellTime;
	}
	public void setSellTime(String sellTime) {
		this.sellTime = sellTime;
	}
	public String getSellBook() {
		return sellBook;
	}
	public void setSellBook(String sellBook) {
		this.sellBook = sellBook;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBuyAmount() {
		return buyAmount;
	}
	public void setBuyAmount(int buyAmount) {
		this.buyAmount = buyAmount;
	}
}
