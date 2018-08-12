package com.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BookDao;
import com.entity.Book;
import com.entity.Categroy;
import com.service.BookService;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public List<Categroy> getCatAll() throws Exception {
		List<Categroy> list = bookDao.findCatAll();
		List<Categroy> cate = findByGrade(list, 1);
		for(Categroy c : cate){
			c.setSubCate(findByGrade(list, c.getCid()));
		}
		return cate;
	}
	
	/**
	 * 根据类别等级获取目录，gid为1的是一级类别
	 * 其他为2级类别，2级类别根据一级类别的id来划分
	 */
	private List<Categroy> findByGrade(List<Categroy> list, int gid){
		List<Categroy> subCats = new ArrayList<Categroy>();
		for (Categroy c : list) {
			if(c.getGradeid() == gid){
				subCats.add(c);
			}
		}
		return subCats;
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public List<Object> getCatAndBook(int cid, int page, int size) throws Exception {
		Categroy cat = bookDao.findCatById(cid);
		int begin = (page - 1) * size;
		List<Book> books = bookDao.limitFindBook(begin, size);
		List<Object> list = new ArrayList<Object>();
		list.add(cat);
		list.add(books);
		return list;
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public List<?> getCatsAndBook(int c1, int c2, int page, int size) throws Exception {
		List<Book> books = new ArrayList<Book>();
		Categroy cat = bookDao.findCatById(c1);
		List<Categroy> cate = bookDao.findCatByGradeId(c1);
		int totalnum = cat.getBnumber();
		int begin = (page - 1) * size;
		int pnum = 0;
		
		//点击一级目录时，查询一级目录下的所有书籍
		if(c2 == 0){
			pnum = totalnum;
			books = bookDao.limitFindBookByCatId(c1, begin, size);
		} else {//点击二级目录时查询该目录下的书籍
			pnum = bookDao.findCatById(c2).getBnumber();
			books = bookDao.limitFindBookByCatId(c2, begin, size);
		}
		
		List<Object> list = new ArrayList<Object>();
		list.add(cat);
		list.add(cate);
		list.add(books);
		list.add(totalnum);
		list.add(pnum);
		return list;
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public Book getBookById(int bid) throws Exception {
		Book book = bookDao.findBookById(bid);
		return book;
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public List<Book> getNHBook() throws Exception {
		Categroy c1 = bookDao.findCatById(3);
		Categroy c2 = bookDao.findCatById(4);
		List<Book> list = new ArrayList<Book>();
		for(Book b1 : c1.getBookSet()){
			for(Book b2 : c2.getBookSet()){
				if(b2.getBid() == b1.getBid()){
					list.add(b2);
				}
			}
		}
		return list;
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public List<Book> getBooks(int cid) throws Exception {
		List<Book> books = bookDao.findByCatId(cid);
		return books;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

}
