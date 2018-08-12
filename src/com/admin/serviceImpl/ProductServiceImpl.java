package com.admin.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.service.ProductService;
import com.dao.BookDao;
import com.entity.Book;
import com.entity.Categroy;
/**
 * 商品处理service实现类
 */
public class ProductServiceImpl implements ProductService {

	private BookDao bookDao;
	
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void addBook(Book b, List<String> cs) throws Exception {
		//修改类别
		Set<Categroy> cats = new HashSet<Categroy>();
		Categroy categroy = null;
		for(String s : cs){
			System.out.println(s);
			if(!s.equals("")){
				categroy = bookDao.findCatByName(s);
				categroy.setBnumber(categroy.getBnumber() + 1);
				bookDao.updetecat(categroy);
				cats.add(categroy);
				categroy = null;
			}
		}
		
		//保存书籍
		b.setCategroySet(cats);
		bookDao.saveBook(b);
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public List<Book> getBookAll() throws Exception {
		List<Book> list = bookDao.findBookAll();
		return list;
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public List<Book> getBook(int page, int size) throws Exception {
		int begin = (page - 1) * size;
		List<Book> list = bookDao.limitFindBook(begin, size);
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
	public Book getBookByName(String bname) throws Exception {
		System.out.println("收索："+bname);
		Book book = bookDao.findByname(bname.replaceAll(" ", ""));
		return book;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void updateBook(Book b, List<String> cs) throws Exception {
		Book book = bookDao.findBookById(b.getBid());
		//把修改的进行替换
		if(b.getPrice()!=0)
			book.setPrice(b.getPrice());
		
		if(b.getAmount()!=0)
			book.setAmount(b.getAmount());
		
		if(!b.getBname().replaceAll(" ","").equals(""))
			book.setBname(b.getBname());
		
		if(!b.getAuthor().replaceAll(" ","").equals(""))
			book.setAuthor(b.getAuthor());
		
		if(b != null || !b.getPicture().replaceAll(" ","").equals(""))
			book.setPicture(b.getPicture());
		
		if(!b.getPublishing().replaceAll(" ","").equals(""))
			book.setPublishing(b.getPublishing());
		
		if(!b.getPublish_time().replaceAll(" ","").equals(""))
			book.setPublish_time(b.getPublish_time());
		
		if(!b.getWord_number().replaceAll(" ","").equals(""))
			book.setWord_number(b.getWord_number());
		
		if(!b.getWhich_edtion().replaceAll(" ","").equals(""))
			book.setWhich_edtion(b.getWhich_edtion());
		
		if(!b.getTotal_page().replaceAll(" ","").equals(""))
			book.setTotal_page(b.getTotal_page());
		
		if(!b.getPrint_time().replaceAll(" ","").equals(""))
			book.setPrint_time(b.getPrint_time());
		
		if(!b.getPrint_number().replaceAll(" ","").equals(""))
			book.setPrint_number(b.getPrint_number());
		
		if(!b.getDescription().replaceAll(" ","").equals(""))
			book.setDescription(b.getDescription());
		
		if(!b.getAuthor_summary().replaceAll(" ","").equals(""))
			book.setAuthor_summary(b.getAuthor_summary());
		
		for(Categroy c : book.getCategroySet())
			c.setBnumber(c.getBnumber()-1);
		
		//修改类别
		Set<Categroy> cats = new HashSet<Categroy>();
		Categroy categroy = null;
		for(String s : cs){
			System.out.println(s);
			if(!s.equals("")){
				System.out.println(s);
				categroy = bookDao.findCatByName(s);
				categroy.setBnumber(categroy.getBnumber() + 1);
				bookDao.updetecat(categroy);
				cats.add(categroy);
				categroy = null;
			}
		}
		
		//保存书籍
		book.setCategroySet(cats);
		bookDao.updateBook(book);
		System.out.println("已保存修改书籍："+b.getBname());
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void deleteBook(int id) throws Exception {
		Book b = bookDao.findBookById(id);
		Set<Categroy> cs = b.getCategroySet();
		for(Categroy c : cs){
			c.setBnumber(c.getBnumber() - 1);
			bookDao.updetecat(c);
		}
		bookDao.deleteProd(id);
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

}
