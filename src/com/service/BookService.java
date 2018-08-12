package com.service;

import java.util.List;

import com.entity.Book;
import com.entity.Categroy;

/**
 * �鼮Service��
 */
public interface BookService {
	
	//��ȡ������
	public List<Categroy> getCatAll() throws Exception;
	
	//��ȡһ��������Ӧ���鼮
	public List<?> getCatAndBook(int cid, int page, int size) throws Exception;
	
	//��ȡ���������Ӧ���鼮
	public List<?> getCatsAndBook(int c1, int c2, int page, int size) throws Exception;
	
	//��ȡ�����鼮id��ȡ���鼮
	public Book getBookById(int bid) throws Exception;
	
	//��ȡ��������
	public List<Book> getNHBook() throws Exception;
	
	//��ȡ����µ��鼮
	public List<Book> getBooks(int cid) throws Exception;
	
}
