package com.admin.service;

import com.admin.entity.Admin;

/**
 * ����Աservice��
 */
public interface AdminService {
	//����Ա��¼
	public Admin getAdm(Admin a) throws Exception;
	
	//��������Ա�û�
	public void saveAdm(Admin a) throws Exception;
	
	//���Ĺ���Ա
	public void updateAdm(Admin a) throws Exception;
}
