package com.dao;

import com.admin.entity.Admin;

/**
 * ����ԱDao��ӿ�
 */
public interface AdminDao {
	
	//��������û���
	public void saveAdmin(Admin admin) throws Exception;
	
	//�޸Ĺ����û�
	public void updateAdmin(Admin admin) throws Exception;
	
	//���ݹ����û�����ѯ
	public Admin findByName(String name) throws Exception;
}
