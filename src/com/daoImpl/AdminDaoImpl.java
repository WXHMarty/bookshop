package com.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.admin.entity.Admin;
import com.dao.AdminDao;

public class AdminDaoImpl implements AdminDao {
	
	private SessionFactory sessionFactory;
	
	@Override
	public void saveAdmin(Admin admin) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(admin);
	}

	@Override
	public void updateAdmin(Admin admin) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(admin);
	}

	@Override
	public Admin findByName(String name) throws Exception {
		Admin admin = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Admin where name=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, name);
		List<Admin> list = query.list();
		if(list.size() != 0){
			admin = list.get(0);
		}
		return admin;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
