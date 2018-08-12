package com.action.book;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.entity.Book;
import com.entity.Categroy;
import com.service.BookService;

/**
 * 热门与新书籍
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class NHListAction extends PageAction {
	private int c;//分类id
	private Categroy cat;
	private List<Book> books = new ArrayList<Book>();
	private int totalnum;//书籍总数量
	
	@Resource(name="bookService")
	private BookService bookService;
	
	@SuppressWarnings("unchecked")
	public String execute() throws Exception{
		List<?> list = bookService.getCatAndBook(c, page, size);
		cat = (Categroy) list.get(0);
		totalnum = cat.getBnumber();
		books = (List<Book>) list.get(1);
		
		// 计算该目录所需页面
		if (totalnum == 0) {
			maxPage = 1;
		} else if (totalnum % size == 0) {
			maxPage = totalnum / size;
		} else {
			maxPage = totalnum / size + 1;
		}
		return "booksList";
	}
	
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public Categroy getCat() {
		return cat;
	}
	public void setCat(Categroy cat) {
		this.cat = cat;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public int getTotalnum() {
		return totalnum;
	}
	public void setTotalnum(int totalnum) {
		this.totalnum = totalnum;
	}
	
}
