package com.dao;

import java.util.List;

import com.entity.Orders;

/**
 * ���ջ��ͻ�DAO��
 */
public interface OrdersDao {

	//���涩������
	public void save(Orders o) throws Exception;
	
	//��ѯ��ǰ�û��µĵ�ַ����
	public List<Orders> findByUid(int uid) throws Exception;

	//��ѯ��ҵĶ��������µ�ʱ������
	public List<Orders> findOrdIts() throws Exception;
	
	//���Ʋ�ѯ��Ҷ���
	public List<Orders> limitFindOrdIts(int begin, int size) throws Exception;
	
	//���ݶ�����Ų�ѯ����
	public Orders findByOiid(int id) throws Exception;
	
	//ɾ������
	public void deleteItem(int id) throws Exception;
}
