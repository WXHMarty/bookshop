package com.admin.serviceImpl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.entity.Admin;
import com.admin.service.AdminService;
import com.dao.AdminDao;
import com.util.Encrypt;

public class AdminServiceImpl implements AdminService {

	private AdminDao adminDao;
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public Admin getAdm(Admin a) throws Exception {
		Admin admin = adminDao.findByName(a.getName());
		System.out.println("=========="+a.getName());
		return admin;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void saveAdm(Admin a) throws Exception {
		System.out.println(a.getPassword());
		String password = Encrypt.md5encrypt(a.getPassword());
		a.setName(a.getName());
		a.setPassword(password);
		adminDao.saveAdmin(a);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void updateAdm(Admin a) throws Exception {
		adminDao.updateAdmin(a);
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

}
