package com.entity;

import java.io.Serializable;

/**
 * ���ﳵ��
 */
public class Item implements Serializable{

	private static final long serialVersionUID = 1L;
	private int itid;//id int(12) NOT NULL auto_increment ���빺�ﳵ�Ķ���id
	private String itname;//itname varchar(100) NOT NULL ��������
	private String itpicture;//itpicture varchar(50) ������ƷͼƬ
	private double price;//price double NOT NULL �۸�
	private int order_num;//order_num int(10) NOT NULL ��������
	private double amount;//amount double NOT NULL  �ܹ��۸�
	private int bid;//��Ӧ���鱾���
	private User user;//���ɶ������û�
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
