package com.action.book;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.action.BaseAction;
import com.entity.Categroy;
import com.service.BookService;
/**
 * 书籍类别Action类
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class CategroyAction extends BaseAction {
	private List<Categroy> cate1;
	
	@Resource(name="bookService")
	private BookService bookService;
	
	public String execute() throws Exception{
		cate1 = bookService.getCatAll();
		return "categroy";
	}
	
	public List<Categroy> getCate1() {
		return cate1;
	}
	public void setCate1(List<Categroy> cate1) {
		this.cate1 = cate1;
	}
}
