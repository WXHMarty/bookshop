package com.daoImpl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.entity.Admin;
import com.dao.AdminDao;

/**
 * 测试AdminDao
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAdminDao {
	
	@Resource(name="adminDao")
	private AdminDao adminDao;
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Test
	public void testSaveAdmin(){
		Admin admin = new Admin();
		admin.setName("abc123456");
		admin.setPassword("123456");
		try {
			adminDao.saveAdmin(admin);
			System.out.println("管理用户："+admin.getName()+"已保存！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
