package com.action.book;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.action.BaseAction;
import com.entity.Book;
import com.service.BookService;
/**
 * 书本详细信息Action
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class BookViewAction extends BaseAction {
	private Book book;
	private int bid;
	
	@Resource(name="bookService")
	private BookService bookService;
	
	public String execute() throws Exception{
		book = bookService.getBookById(bid);
		System.out.println(book.getAmount());
		return "bookview";
	}

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

}
