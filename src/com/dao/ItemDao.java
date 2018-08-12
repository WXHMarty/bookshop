package com.dao;

import java.util.List;

import com.entity.Item;

/**
 * ���ﳵDAO��
 */
public interface ItemDao {

	//���湺�ﳵ��Ʒ
	public void save(Item item) throws Exception;
	
	//�����û�ID��ѯ���ﳵ��Ʒ
	public List<Item> findByUid(int uid) throws Exception;
	
	//���ݶ�����Ų�ѯ
	public Item findById(int itid) throws Exception;
	
	//�޸Ķ�������
	public void update(Item item) throws Exception;
	
	//ɾ������
	public boolean delete(int itid) throws Exception;
}
