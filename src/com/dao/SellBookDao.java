package com.dao;

import com.entity.SellBook;

/**
 * ���ۼ�¼Dao�ӿ�
 */
public interface SellBookDao {
	//ͨ���鼮ID��ѯ�鼮
	public SellBook findByBid(int bid) throws Exception;
	
	//�����¼
	public void saveSellBook(SellBook sb) throws Exception;
	
	//���ļ�¼
	public void updateSellBook(SellBook sb) throws Exception;
}
