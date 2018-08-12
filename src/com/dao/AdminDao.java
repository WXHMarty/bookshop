package com.dao;

import com.admin.entity.Admin;

/**
 * 管理员Dao层接口
 */
public interface AdminDao {
	
	//保存管理用户名
	public void saveAdmin(Admin admin) throws Exception;
	
	//修改管理用户
	public void updateAdmin(Admin admin) throws Exception;
	
	//根据管理用户名查询
	public Admin findByName(String name) throws Exception;
}
