package com.service;

import java.util.List;

import com.entity.Book;
import com.entity.Categroy;

/**
 * 书籍Service类
 */
public interface BookService {
	
	//获取多个类别
	public List<Categroy> getCatAll() throws Exception;
	
	//获取一个类别和相应的书籍
	public List<?> getCatAndBook(int cid, int page, int size) throws Exception;
	
	//获取多个类别和相应的书籍
	public List<?> getCatsAndBook(int c1, int c2, int page, int size) throws Exception;
	
	//获取根据书籍id获取该书籍
	public Book getBookById(int bid) throws Exception;
	
	//获取热销新书
	public List<Book> getNHBook() throws Exception;
	
	//获取类别下的书籍
	public List<Book> getBooks(int cid) throws Exception;
	
}
