package com.daoImpl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.entity.User;
import com.util.FormatData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUserDao {
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Test
	public void testFindByUsername(){
		try {
			User u = userDao.findByUsername("abc123456");
			System.out.println(u.getUsername() + u.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Test
	public void testSave(){
		User u = new User();
		u.setUsername("wxh");
		u.setPassword("123564");
		u.setLast_login_time(FormatData.nowTime());
		u.setLast_login_ip("123");
		try {
			userDao.save(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	@Test
	public void testUpdate(){
		User u = new User();
		u.setUid(2);
		u.setUsername("wang");
		u.setPassword("111111");
		u.setLast_login_time(FormatData.nowTime());
		u.setLast_login_ip("0.0.1");
		try {
			userDao.update(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
