package com.entity;

import java.io.Serializable;
import java.util.Set;
/**
 * 待收货客户资料类
 */
public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;
	private int oid;//oid int(10) NOT NULL auto_increment
	private long ord_num;// ord_num bigint(20) NOT NULL, --订单编号
	private String order_time;// order_time varchar(20) NOT NULL, --下单时间
	private double total_price;// total_price double NOT NULL, --总价
	private String receive_name;// receive_name varchar(100) default NULL,收货人名字
	private String address;// address varchar(200) default NULL 收货地址
	private String zipCode;// zipCode varchar(8) default NULL,邮编
	private String mobile;// mobile varchar(20) default NULL, 手机号
	private String phone;// phone varchar(20) default NULL,电话
	private User user;//该order的所属用户
	private Set<ItProd> ordits;
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public long getOrd_num() {
		return ord_num;
	}
	public void setOrd_num(long ord_num) {
		this.ord_num = ord_num;
	}
	public String getOrder_time() {
		return order_time;
	}
	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public String getReceive_name() {
		return receive_name;
	}
	public void setReceive_name(String receive_name) {
		this.receive_name = receive_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<ItProd> getOrdits() {
		return ordits;
	}
	public void setOrdits(Set<ItProd> ordits) {
		this.ordits = ordits;
	}
}
