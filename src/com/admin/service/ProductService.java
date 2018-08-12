package com.admin.service;

import java.util.List;

import com.entity.Book;

/**
 * ��Ʒ����servoice��
 */
public interface ProductService {
	//������鼮
	public void addBook(Book b, List<String> cs) throws Exception;
	
	//��ȡȫ���鼮
	public List<Book> getBookAll() throws Exception;
	
	//ͨ��id��ȡ�鼮
	public Book getBookById(int bid) throws Exception;
	
	//ͨ��������ȡ�鼮
	public Book getBookByName(String bname) throws Exception;
	
	//���ƻ�ȡ�鼮
	public List<Book> getBook(int page, int size) throws Exception;
	
	//�޸��鼮��Ϣ
	public void updateBook(Book b, List<String> cs) throws Exception;
	
	//ɾ���鼮
	public void deleteBook(int id) throws Exception;
	
}
