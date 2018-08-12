package com.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 书籍类别类
 */
public class Categroy implements Serializable{

	private static final long serialVersionUID = 1L;
	private int cid;//类别id
	private String cname;//类别名称
	private String cvalue;//类别值
	private int gradeid;//分类级别
	private int bnumber;//书本种类数量
	private List<Categroy> subCate;//类别集合
	private Set<Book> bookSet = new HashSet<Book>();//类别中放进书籍的集合
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCvalue() {
		return cvalue;
	}
	public void setCvalue(String cvalue) {
		this.cvalue = cvalue;
	}
	public int getGradeid() {
		return gradeid;
	}
	public void setGradeid(int gradeid) {
		this.gradeid = gradeid;
	}
	public int getBnumber() {
		return bnumber;
	}
	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}
	public List<Categroy> getSubCate() {
		return subCate;
	}
	public void setSubCate(List<Categroy> subCate) {
		this.subCate = subCate;
	}
	public Set<Book> getBookSet() {
		return bookSet;
	}
	public void setBookSet(Set<Book> bookSet) {
		this.bookSet = bookSet;
	}
	
}
