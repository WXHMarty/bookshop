package com.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.OrdersDao;
import com.entity.Orders;
/**
 * 待收货客户DAO实现类
 */
public class OrdersDaoImpl implements OrdersDao {
	
	private SessionFactory sessionFactory;
	
	//保存资料
	@Override
	public void save(Orders o)throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(o);
	}

	@Override
	public List<Orders> findByUid(int uid) throws Exception {
		List<Orders> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "select o from Orders o,User u where o in elements(u.ordSet) and u.uid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, uid);
		list = query.list();
		return list;
	}

	@Override
	public List<Orders> findOrdIts() throws Exception {
		List<Orders> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Orders";
		Query query = session.createQuery(hql);
		list = query.list();
		return list;
	}

	@Override
	public List<Orders> limitFindOrdIts(int begin, int size) throws Exception {
		List<Orders> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Orders";
		Query query = session.createQuery(hql);
		query.setFirstResult(begin);
		query.setMaxResults(size);
		list = query.list();
		return list;
	}

	@Override
	public Orders findByOiid(int id) throws Exception {
		Orders item = null;
		Session session = sessionFactory.getCurrentSession();
		item = session.get(Orders.class, id);
		return item;
	}

	@Override
	public void deleteItem(int id) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Orders o = session.get(Orders.class, id);
		session.delete(o);
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
