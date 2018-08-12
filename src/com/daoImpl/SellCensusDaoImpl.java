package com.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.SellCensusDao;
import com.entity.SellBook;
import com.entity.SellCensus;

public class SellCensusDaoImpl implements SellCensusDao {

	private SessionFactory sessionFactory;
	
	@Override
	public void saveSellCensus(SellCensus sc) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(sc);
	}

	@Override
	public List<SellCensus> findByUser(int uid) throws Exception {
		List<SellCensus> scs = new ArrayList<SellCensus>();
		Session session = sessionFactory.getCurrentSession();
		String hql = "from SellCensus where purchaser_id=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, uid);
		scs = query.list();
		return scs;
	}

	@Override
	public List<SellBook> findAll() throws Exception {
		List<SellBook> sb = new ArrayList<SellBook>();
		Session session = sessionFactory.getCurrentSession();
		String hql = "from SellBook";
		Query query = session.createQuery(hql);
		sb = query.list();
		return sb;
	}

	@Override
	public List<SellBook> limitFindAll(int begin, int size) throws Exception {
		List<SellBook> sb = new ArrayList<SellBook>();
		Session session = sessionFactory.getCurrentSession();
		String hql = "from SellBook";
		Query query = session.createQuery(hql);
		query.setFirstResult(begin);
		query.setMaxResults(size);
		sb = query.list();
		return sb;
	}

	@Override
	public List<SellCensus> findByBid(int bid) throws Exception {
		List<SellCensus> list = new ArrayList<SellCensus>();
		Session session = sessionFactory.getCurrentSession();
		String hql = "from SellCensus where sellBook_id=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, bid);
		list = query.list();
		return list;
	}

	@Override
	public List<SellCensus> limitFindByBid(int bid, int begin, int size)
			throws Exception {
		List<SellCensus> list = new ArrayList<SellCensus>();
		Session session = sessionFactory.getCurrentSession();
		String hql = "from SellCensus where sellBook_id=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, bid);
		query.setFirstResult(begin);
		query.setMaxResults(size);
		list = query.list();
		return list;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
