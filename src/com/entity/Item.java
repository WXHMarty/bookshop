package com.entity;

import java.io.Serializable;

/**
 * 购物车类
 */
public class Item implements Serializable{

	private static final long serialVersionUID = 1L;
	private int itid;//id int(12) NOT NULL auto_increment 加入购物车的订单id
	private String itname;//itname varchar(100) NOT NULL 订单名字
	private String itpicture;//itpicture varchar(50) 订单商品图片
	private double price;//price double NOT NULL 价格
	private int order_num;//order_num int(10) NOT NULL 订单数量
	private double amount;//amount double NOT NULL  总够价格
	private int bid;//对应的书本编号
	private User user;//生成订单的用户
	public int getItid() {
		return itid;
	}
	public void setItid(int itid) {
		this.itid = itid;
	}
	public String getItname() {
		return itname;
	}
	public void setItname(String itname) {
		this.itname = itname;
	}
	public String getItpicture() {
		return itpicture;
	}
	public void setItpicture(String itpicture) {
		this.itpicture = itpicture;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOrder_num() {
		return order_num;
	}
	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
