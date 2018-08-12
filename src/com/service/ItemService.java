package com.service;

import java.util.List;

import com.entity.Book;
import com.entity.Item;
import com.entity.User;

/**
 * ���ﳵService�ӿ�
 */
public interface ItemService {
	//���湺�ﳵ����
	public Book saveItem(User u, int id) throws Exception;
	
	//�޸Ĺ��ﳵ��������
	public void updateItem(int itid, int num) throws Exception;
	
	//ɾ���������ﳵ����
	public void deleteItem(int itid) throws Exception;
	
	//ɾ��ȫ�����ﳵ����
	public void deleteAllItem(User u) throws Exception;
	
	//��ȡ���ﳵ����
	public List<Item> getItems(User u) throws Exception;
}
