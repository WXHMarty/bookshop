package com.service;

import com.entity.Orders;
import com.entity.User;

/**
 * 订单存储service接口
 */
public interface OrdersService {
	//存储订单
	public boolean saveOrd(Orders order, User user) throws Exception;
}
