package com.admin.service;

import com.admin.entity.Admin;

/**
 * 管理员service层
 */
public interface AdminService {
	//管理员登录
	public Admin getAdm(Admin a) throws Exception;
	
	//新增管理员用户
	public void saveAdm(Admin a) throws Exception;
	
	//更改管理员
	public void updateAdm(Admin a) throws Exception;
}
