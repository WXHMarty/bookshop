package com.service;

import com.entity.Orders;
import com.entity.User;

/**
 * �����洢service�ӿ�
 */
public interface OrdersService {
	//�洢����
	public boolean saveOrd(Orders order, User user) throws Exception;
}
