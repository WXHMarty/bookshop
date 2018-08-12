package com.dao;

import java.util.List;

import com.entity.Book;
import com.entity.Categroy;

/**
 * 书类查询DAO接口
 */
public interface BookDao {
	
	//无参查询
	public List<Categroy> findCatAll() throws Exception;
	
	//通过ID查询
	public Categroy findCatById(int cid) throws Exception;
	
	//通过级别id查询
	public List<Categroy> findCatByGradeId(int gid) throws Exception;
	
	//根据cname查询
	public Categroy findCatByName(String cname) throws Exception;
	
	//修改分类
	public void updetecat(Categroy categroy) throws Exception;
		
	//保存书籍
	public void saveBook(Book book) throws Exception;
	
	//查询全部书籍
	public List<Book> findBookAll() throws Exception;
	
	//限制查询全部书籍
	public List<Book> limitFindBook(int begin, int size) throws Exception;
	
	//根据书籍id查询
	public Book findBookById(int bid) throws Exception;
	
	//根据书名查询
	public Book findByname(String bname) throws Exception;
	
	//根据分类查询
	public List<Book> findByCatId(int cid) throws Exception;
	
	//根据分类限制查询
	public List<Book> limitFindBookByCatId(int cid, int begin, int size) throws Exception;
	
	//修改书籍
	public void updateBook(Book b) throws Exception;
	
	//删除书籍
	public void deleteProd(int bid) throws Exception;
}
