package com.entity;

import java.io.Serializable;
/**
 * �����еĲ�Ʒ
 */
public class ItProd implements Serializable {
	private static final long serialVersionUID = 1L;
	private int ipid;//��Ʒid
	private String proname;//��Ʒ����
	private int pro_num;//��Ʒ����
	
	public int getIpid() {
		return ipid;
	}
	public void setIpid(int ipid) {
		this.ipid = ipid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getPro_num() {
		return pro_num;
	}
	public void setPro_num(int pro_num) {
		this.pro_num = pro_num;
	}
	
}
