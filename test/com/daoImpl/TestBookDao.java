package com.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BookDao;
import com.entity.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestBookDao {

	@Resource(name="bookDao")
	private BookDao bookDao;
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Test
	public void testFindById(){
		try {
			Book book = bookDao.findBookById(1);
			System.out.println(book.getBname());
			System.out.println(book.getAuthor());
			System.out.println(book.getAuthor_summary());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Test
	public void testFindByCatId(){
		try {
			List<Book> list = bookDao.findByCatId(1);
			for(Book b : list){
				System.out.println(b.getBname());
				System.out.println(b.getAuthor());
				System.out.println(b.getAuthor_summary());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
