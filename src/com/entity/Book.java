package com.entity;

import java.io.Serializable;
import java.util.Set;

/**
 * 书籍类
 */
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	private int bid;//书本id
	private String bname;//书名
	private String author;//作者
	private String picture;//封面图片
	private String publishing;//出版社
	private String publish_time;//出版时间
	private String word_number;//字数
	private String which_edtion;//版次
	private String total_page;//页数
	private String print_time;//印刷时间
	private String print_number;//印次
	private String description;//内容简介
	private String author_summary;//作者简介
	private double price;//书本价格
	private int amount;//库存数量
	private Set<Categroy> categroySet;//所属的类别
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPublishing() {
		return publishing;
	}
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	public String getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}
	public String getWord_number() {
		return word_number;
	}
	public void setWord_number(String word_number) {
		this.word_number = word_number;
	}
	public String getWhich_edtion() {
		return which_edtion;
	}
	public void setWhich_edtion(String which_edtion) {
		this.which_edtion = which_edtion;
	}
	public String getTotal_page() {
		return total_page;
	}
	public void setTotal_page(String total_page) {
		this.total_page = total_page;
	}
	public String getPrint_time() {
		return print_time;
	}
	public void setPrint_time(String print_time) {
		this.print_time = print_time;
	}
	public String getPrint_number() {
		return print_number;
	}
	public void setPrint_number(String print_number) {
		this.print_number = print_number;
	}
	public String getAuthor_summary() {
		return author_summary;
	}
	public void setAuthor_summary(String author_summary) {
		this.author_summary = author_summary;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Set<Categroy> getCategroySet() {
		return categroySet;
	}
	public void setCategroySet(Set<Categroy> categroySet) {
		this.categroySet = categroySet;
	}
}
