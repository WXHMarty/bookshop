package com.entity;

import java.io.Serializable;
/**
 * ����ͳ����
 */
public class SellCensus implements Serializable {
	private static final long serialVersionUID = 1L;
	private int scid;
	private int purchaser_id;//������id
	private String purchaser;//������
	private int sellBook_id;//�۳��鼮id
	private String sellBook;//�۳��鼮
	private String sellTime;//����ʱ��
	private double price;//����
	private int buyAmount;//�۳�����

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
