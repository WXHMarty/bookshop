package com.admin.service;

import java.util.List;

import com.entity.Book;

/**
 * 商品处理servoice类
 */
public interface ProductService {
	//添加新书籍
	public void addBook(Book b, List<String> cs) throws Exception;
	
	//获取全部书籍
	public List<Book> getBookAll() throws Exception;
	
	//通过id获取书籍
	public Book getBookById(int bid) throws Exception;
	
	//通过书名获取书籍
	public Book getBookByName(String bname) throws Exception;
	
	//限制获取书籍
	public List<Book> getBook(int page, int size) throws Exception;
	
	//修改书籍信息
	public void updateBook(Book b, List<String> cs) throws Exception;
	
	//删除书籍
	public void deleteBook(int id) throws Exception;
	
}
