package com.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.UserDao;
import com.entity.User;
/**
 * 查询用户DAO实现类
 */
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;
	
	@Override
	public User findById(int id) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		User u = session.get(User.class, id);
		return u;
	}
	
	//根据用户名查询
	@Override
	public User findByUsername(String username) throws Exception{
		User u = new User();
		List<User> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from User where username=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, username);
		list = query.list();
		if(list.size() > 0){
			u = list.get(0);
		}
		return u;
	}

	@Override
	public List<User> findAll() throws Exception {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from User";
		Query query = session.createQuery(hql);
		List<User> users = query.list();
		return users;
	}

	@Override
	public List<User> limitfindAll(int begin, int size) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from User";
		Query query = session.createQuery(hql);
		query.setFirstResult(begin);
		query.setMaxResults(size);
		List<User> users = query.list();
		return users;
	}

	@Override
	public void save(User u) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(u);
	}

	@Override
	public void update(User u) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(u);
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
