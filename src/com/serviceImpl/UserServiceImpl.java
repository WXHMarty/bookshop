package com.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.SellCensusDao;
import com.dao.UserDao;
import com.entity.SellCensus;
import com.entity.User;
import com.service.UserService;
/**
 * 用户Service实现类
 */
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	private SellCensusDao sellCensusDao;
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public User getUser(String username) throws Exception {
		User u = userDao.findByUsername(username);
		return u;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public User saveUser(User u) throws Exception {
		userDao.save(u);
		User user = userDao.findByUsername(u.getUsername());
		return user;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void updateUser(User u) throws Exception {
		userDao.update(u);
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@SuppressWarnings("unchecked")
	@Override
	public List<?> getUsers(int page, int size) throws Exception {
		List list = new ArrayList();
		int begin = (page - 1) * size;
		int pnum = 0;
		pnum = userDao.findAll().size();
		List<User> users = userDao.limitfindAll(begin, size);
		list.add(pnum);
		list.add(users);
		return list;
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@SuppressWarnings("unchecked")
	@Override
	public List<?> getUser(int uid) throws Exception {
		List list = new ArrayList();
		User user = userDao.findById(uid);
		List<SellCensus> scss = sellCensusDao.findByUser(uid);
		list.add(user);
		list.add(scss);
		return list;
	}

	public void setSellCensusDao(SellCensusDao sellCensusDao) {
		this.sellCensusDao = sellCensusDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
