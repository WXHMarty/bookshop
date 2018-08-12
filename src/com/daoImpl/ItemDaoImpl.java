package com.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.ItemDao;
import com.entity.Item;
/**
 * 购物车DAO实现类
 */
public class ItemDaoImpl implements ItemDao {

	private SessionFactory sessionFactory;
	
	//保存购物车
	@Override
	public void save(Item item) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(item);
	}
	
	@Override
	public List<Item> findByUid(int uid) throws Exception {
		List<Item> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "select i from Item i,User u where i in elements (u.itSet) and u.uid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, uid);
		list = query.list();
		return list;
	}

	@Override
	public void update(Item item) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(item);
	}
	
	//删除资料
	public boolean delete(int itid) throws Exception{
		Session session = sessionFactory.getCurrentSession();
		String hql = "delete from Item i where i.itid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, itid);
		query.executeUpdate();
		return true;
	}

	@Override
	public Item findById(int itid) throws Exception {
		Item item = null;
		Session session = sessionFactory.getCurrentSession();
		item = session.get(Item.class, itid);
		return item;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
