package com.action.book;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.entity.Book;
import com.entity.Categroy;
import com.service.BookService;

/**
 * 书籍类别排列Action
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class BookListAction extends PageAction {
	private int c1;//一级目录id
	private int c2 = 0;//二级目录id
	private List<Categroy> cate;
	private Categroy cat;
	private List<Book> books = new ArrayList<Book>();
	private int totalnum;//书籍总数量
	
	@Resource(name="bookService")
	private BookService bookService;

	//跳转到相应类别的书籍页面
	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		List<?> list = bookService.getCatsAndBook(c1, c2, page, size);
		int pnum = 0;
		cat = (Categroy) list.get(0);
		cate = (List<Categroy>) list.get(1);
		books = (List<Book>) list.get(2);
		totalnum = (Integer) list.get(3);
		pnum = (Integer) list.get(4);
		
		// 计算该目录所需页面
		if (pnum == 0) {
			maxPage = 1;
		} else if (pnum % size == 0) {
			maxPage = pnum / size;
		} else {
			maxPage = pnum / size + 1;
		}
		return "list";
	}

	public int getC1() {
		return c1;
	}
	public void setC1(int c1) {
		this.c1 = c1;
	}
	public int getC2() {
		return c2;
	}
	public void setC2(int c2) {
		this.c2 = c2;
	}
	public List<Categroy> getCate() {
		return cate;
	}
	public void setCate(List<Categroy> cate) {
		this.cate = cate;
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
