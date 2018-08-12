package com.service;

import java.util.List;

import com.entity.User;

/**
 * �û�Service��
 */
public interface UserService {
	//�����û����ֻ�ȡ�û�
	public User getUser(String username) throws Exception;
	
	//�����û�
	public User saveUser(User u) throws Exception;
	
	//�����û�
	public void updateUser(User u) throws Exception;
	
	//��ȡ�û��б�
	public List<?> getUsers(int page, int size) throws Exception;
	
	//�����û�id��ȡ�û�
	public List<?> getUser(int uid) throws Exception;
}
