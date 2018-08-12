package com.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.SellBookDao;
import com.entity.SellBook;

public class SellBookDaoImpl implements SellBookDao {

	private SessionFactory sessionFactory;
	
	@Override
	public SellBook findByBid(int bid) throws Exception {
		SellBook sb = null;
		List<SellBook> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from SellBook where bid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, bid);
		list = query.list();
		if(list.size() != 0)
			sb = list.get(0);
		return sb;
	}

	@Override
	public void saveSellBook(SellBook sb) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(sb);
	}

	@Override
	public void updateSellBook(SellBook sb) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(sb);
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
