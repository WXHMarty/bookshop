package com.dao;

import java.util.List;
import com.entity.User;

/**
 * 用户DAO层接口
 */
public interface UserDao {
	
	//根据用户id查询
	public User findById(int id) throws Exception;
	
	//按照用户名查询用户
	public User findByUsername(String username) throws Exception;
	
	//查询全部用户
	public List<User> findAll() throws Exception;
	
	//限制查询用户
	public List<User> limitfindAll(int begin, int size) throws Exception;

	//保存用户
	public void save(User u) throws Exception;
	
	//更改用户信息
	public void update(User u) throws Exception;
}
