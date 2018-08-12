package com.dao;

import java.util.List;

import com.entity.Book;
import com.entity.Categroy;

/**
 * �����ѯDAO�ӿ�
 */
public interface BookDao {
	
	//�޲β�ѯ
	public List<Categroy> findCatAll() throws Exception;
	
	//ͨ��ID��ѯ
	public Categroy findCatById(int cid) throws Exception;
	
	//ͨ������id��ѯ
	public List<Categroy> findCatByGradeId(int gid) throws Exception;
	
	//����cname��ѯ
	public Categroy findCatByName(String cname) throws Exception;
	
	//�޸ķ���
	public void updetecat(Categroy categroy) throws Exception;
		
	//�����鼮
	public void saveBook(Book book) throws Exception;
	
	//��ѯȫ���鼮
	public List<Book> findBookAll() throws Exception;
	
	//���Ʋ�ѯȫ���鼮
	public List<Book> limitFindBook(int begin, int size) throws Exception;
	
	//�����鼮id��ѯ
	public Book findBookById(int bid) throws Exception;
	
	//����������ѯ
	public Book findByname(String bname) throws Exception;
	
	//���ݷ����ѯ
	public List<Book> findByCatId(int cid) throws Exception;
	
	//���ݷ������Ʋ�ѯ
	public List<Book> limitFindBookByCatId(int cid, int begin, int size) throws Exception;
	
	//�޸��鼮
	public void updateBook(Book b) throws Exception;
	
	//ɾ���鼮
	public void deleteProd(int bid) throws Exception;
}
