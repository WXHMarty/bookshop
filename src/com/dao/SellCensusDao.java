package com.dao;

import java.util.List;

import com.entity.SellBook;
import com.entity.SellCensus;

/**
 * �����¼Dao��
 */
public interface SellCensusDao {
	//���湺���¼
	public void saveSellCensus(SellCensus sc) throws Exception;
	
	//�����û���ѯ�����¼
	public List<SellCensus> findByUser(int uid) throws Exception;
	
	//��ѯ�����鼮���ۼ�¼
	public List<SellBook> findAll() throws Exception;
	
	//��ҳ��ѯ�����鼮���ۼ�¼
	public List<SellBook> limitFindAll(int begin, int size) throws Exception;
	
	//ͨ��bid��ѯ�����鼮
	public List<SellCensus> findByBid(int bid) throws Exception;
	
	//ͨ��bid��ѯ�����鼮
	public List<SellCensus> limitFindByBid(int bid, int begin, int size) throws Exception;
	
}
