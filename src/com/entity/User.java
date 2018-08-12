package com.entity;

import java.io.Serializable;
import java.util.Set;

/**
 * �û���
 */
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private int uid;//�û�id
	private String username;//�û���
	private String password;//�û�����
	private String reg_time;//ע��ʱ��
	private String last_login_time;// --���һ�ε�¼��ʱ��
	private String last_login_ip;// --��¼IP
	private Set<Item> itSet;//���ﳵ�е���Ʒ����
	private Set<Orders> ordSet;//�û��еĶ���

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReg_time() {
		return reg_time;
	}
	public void setReg_time(String reg_time) {
		this.reg_time = reg_time;
	}
	public String getLast_login_time() {
		return last_login_time;
	}
	public void setLast_login_time(String last_login_time) {
		this.last_login_time = last_login_time;
	}
	public String getLast_login_ip() {
		return last_login_ip;
	}
	public void setLast_login_ip(String last_login_ip) {
		this.last_login_ip = last_login_ip;
	}
	public Set<Item> getItSet() {
		return itSet;
	}
	public void setItSet(Set<Item> itSet) {
		this.itSet = itSet;
	}
	public Set<Orders> getOrdSet() {
		return ordSet;
	}
	public void setOrdSet(Set<Orders> ordSet) {
		this.ordSet = ordSet;
	}
}
