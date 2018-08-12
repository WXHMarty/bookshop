package com.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.BookDao;
import com.entity.Book;
import com.entity.Categroy;
/**
 * 书籍查询DAO实现类
 */
public class BookDaoImpl implements BookDao {
	private SessionFactory sessionFactory;

	@Override
	public List<Categroy> findCatAll() throws Exception {
		List<Categroy> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Categroy";
		Query query = session.createQuery(hql);
		list = query.list();
		return list;
	}
	
	@Override
	public Categroy findCatById(int cid) throws Exception {
		List<Categroy> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Categroy where cid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, cid);
		list = query.list();
		Categroy categroy = list.get(0);
		return categroy;
	}

	@Override
	public List<Categroy> findCatByGradeId(int gid) throws Exception {
		List<Categroy> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Categroy where gradeid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, gid);
		list = query.list();
		return list;
	}

	@Override
	public Categroy findCatByName(String cname) throws Exception {
		List<Categroy> list = null;
		Categroy categroy = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Categroy where cname=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, cname);
		list = query.list();
		if(list.size() != 0){
			categroy = list.get(0);
		}
		return categroy;
	}

	@Override
	public void updetecat(Categroy categroy) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(categroy);
	}

	//保存书籍
	@Override
	public void saveBook(Book book) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(book);
	}

	@Override
	public List<Book> findBookAll() throws Exception {
		List<Book> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Book";
		Query query = session.createQuery(hql);
		list = query.list();
		return list;
	}

	@Override
	public List<Book> limitFindBook(int begin, int size) throws Exception {
		List<Book> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Book";
		Query query = session.createQuery(hql);
		query.setFirstResult(begin);
		query.setMaxResults(size);
		list = query.list();
		return list;
	}

	//根据书本id查询
	@Override
	public Book findBookById(int bid) throws Exception {
		Book book = null;
		List<Book> list = null;
		Session session = sessionFactory.getCurrentSession();
		book = session.get(Book.class, bid);
		return book;
	}

	@Override
	public Book findByname(String bname) throws Exception {
		Book book = new Book();
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Book where bname=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, bname);
		List<Book> list = query.list();
		if(list.size() != 0){
			book = list.get(0);
		}
		return book;
	}

	//根据分类查询
	@Override
	public List<Book> findByCatId(int cid) throws Exception {
		List<Book> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "select b from Book b,Categroy c where b in elements(c.bookSet) and c.cid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, cid);
		list = query.list();
		return list;
	}

	@Override
	public List<Book> limitFindBookByCatId(int cid, int begin, int size)
			throws Exception {
		List<Book> list = null;
		Session session = sessionFactory.getCurrentSession();
		String hql = "select b from Book b,Categroy c where b in elements(c.bookSet) and c.cid=?";
		Query query = session.createQuery(hql);
		query.setParameter(0, cid);
		query.setFirstResult(begin);
		query.setMaxResults(size);
		list = query.list();
		return list;
	}

	@Override
	public void updateBook(Book b) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.update(b);
	}

	@Override
	public void deleteProd(int bid) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Book b = session.get(Book.class, bid);
		session.delete(b);
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
