package com.service;

import java.util.List;

import com.entity.User;

/**
 * 用户Service类
 */
public interface UserService {
	//根据用户名字获取用户
	public User getUser(String username) throws Exception;
	
	//保存用户
	public User saveUser(User u) throws Exception;
	
	//更改用户
	public void updateUser(User u) throws Exception;
	
	//获取用户列表
	public List<?> getUsers(int page, int size) throws Exception;
	
	//根据用户id获取用户
	public List<?> getUser(int uid) throws Exception;
}
