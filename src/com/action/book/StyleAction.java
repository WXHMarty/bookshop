package com.action.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.action.BaseAction;
import com.entity.Book;
import com.service.BookService;
/**
 * 按不同的形式分出
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class StyleAction extends BaseAction {
	List<Book> rebooks =new ArrayList<Book>();
	List<Book> hotbooks =new ArrayList<Book>();
	List<Book> newbooks =new ArrayList<Book>();
	List<Book> nhbooks =new ArrayList<Book>();
	
	@Resource(name="bookService")
	private BookService bookService;
	
	//跳转到主页
	public String execute() throws Exception{
		return "main";
	}
	
	//热销书籍
	public String hotBook() throws Exception{
		List<Book> list = bookService.getBooks(3);
		for(int i=0;i<4;i++){
			hotbooks.add(list.get(new Random().nextInt(list.size()-1)));
		}
		System.out.println("============hotBook============");
		return "hot";
	}
	
	//推荐书籍
	public String recommend() throws Exception{
		List<Book> list = bookService.getBooks(2);
		for(int i=0; i<2; i++)
			rebooks.add(list.get(new Random().nextInt(list.size())));
		System.out.println("===========recommend==========");
		return "recommend";
	}
	
	//新书
	public String newBook() throws Exception{
		List<Book> list = bookService.getBooks(4);
		for(int i=0;i<4;i++){
			newbooks.add(list.get(new Random().nextInt(list.size()-1)));
		}
		System.out.println("==============newBokk=============");
		return "new";
	}
	
	//热销新书
	public String newHotBook() throws Exception{
		List<Book> list1 = bookService.getBooks(3);
		List<Book> list2 = bookService.getBooks(4);
		List<Book> list = new ArrayList<Book>();
		for(Book b1 : list1){
			for(Book b2 : list2){
				if(b1.getBid() == b2.getBid()){
					list.add(b1);
				}
			}
		}
		for(int i=0;i<4;i++){
			nhbooks.add(list.get(new Random().nextInt(list.size()-1)));
		}
		System.out.println("===========hot++++++++++new==========");
		return "newhot";
	}
	
	public List<Book> getRebooks() {
		return rebooks;
	}
	public void setRebooks(List<Book> rebooks) {
		this.rebooks = rebooks;
	}
	public List<Book> getHotbooks() {
		return hotbooks;
	}
	public void setHotbooks(List<Book> hotbooks) {
		this.hotbooks = hotbooks;
	}
	public List<Book> getNewbooks() {
		return newbooks;
	}
	public void setNewbooks(List<Book> newbooks) {
		this.newbooks = newbooks;
	}
	public List<Book> getNhbooks() {
		return nhbooks;
	}
	public void setNhbooks(List<Book> nhbooks) {
		this.nhbooks = nhbooks;
	}
	
}
