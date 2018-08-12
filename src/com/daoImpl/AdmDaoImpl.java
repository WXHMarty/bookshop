package com.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.admin.entity.Admin;
import com.dao.AdmDao;

public class AdmDaoImpl implements AdmDao {

	
	private SessionFactory sessionFactory;
	
	@Override
	public Admin getAdmin(int id) {
		Session session = sessionFactory.getCurrentSession();
		Admin a = session.get(Admin.class, id);
		return a;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
