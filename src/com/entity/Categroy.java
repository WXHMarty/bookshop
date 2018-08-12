package com.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * �鼮�����
 */
public class Categroy implements Serializable{

	private static final long serialVersionUID = 1L;
	private int cid;//���id
	private String cname;//�������
	private String cvalue;//���ֵ
	private int gradeid;//���༶��
	private int bnumber;//�鱾��������
	private List<Categroy> subCate;//��𼯺�
	private Set<Book> bookSet = new HashSet<Book>();//����зŽ��鼮�ļ���
	
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
