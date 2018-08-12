package com.action.book;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.entity.Book;
import com.service.BookService;

/**
 * ������������Action
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class NewHotAction extends PageAction {
	private List<Book> books = new ArrayList<Book>();
	private int totalnum;//�鼮������
	
	@Resource(name="bookService")
	private BookService bookService;

	public String execute() throws Exception{
		List<Book> list = bookService.getNHBook();
		int pnum = 0;
		int begin = (page - 1) * size;
		totalnum = list.size();
		pnum = list.size();
		if(begin+size<pnum){
			for(int i=0;i<size;i++)
				books.add(list.get(begin + i));
		}else{
			for(int i=0;i<pnum-begin;i++)
				books.add(list.get(begin + i));
		}
		// �����Ŀ¼����ҳ��
		if (pnum == 0) {
			maxPage = 1;
		} else if (pnum % size == 0) {
			maxPage = pnum / size;
		} else {
			maxPage = pnum / size + 1;
		}
		return "nandH_List";
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
