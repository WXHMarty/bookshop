package com.admin.service;

import java.util.List;

import com.entity.Orders;

/**
 * ��������service
 */
public interface ItemDetailService {
	
	//��ȡȫ������
	public List<Orders> getOrdItemAll() throws Exception;
	
	//���ƻ�ȡ����
	public List<Orders> getOrdItem(int page, int size) throws Exception;

	//ͨ��id��ȡһ������
	public Orders getitById(int id) throws Exception;
	
	//ɾ������
	public void deleteIt(int id) throws Exception;
	
	//��ȡ���ۼ�¼
	public List<?> getSellCensus(int page, int size) throws Exception;
	
	//�����鼮id��ȡ���ۼ�¼
	public List<?> getSellCensusByBid(int bid, int page, int size) throws Exception;
	
}
