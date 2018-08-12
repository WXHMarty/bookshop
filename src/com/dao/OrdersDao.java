package com.dao;

import java.util.List;

import com.entity.Orders;

/**
 * 待收货客户DAO类
 */
public interface OrdersDao {

	//保存订单资料
	public void save(Orders o) throws Exception;
	
	//查询当前用户下的地址集合
	public List<Orders> findByUid(int uid) throws Exception;

	//查询买家的订单，按下单时间排序
	public List<Orders> findOrdIts() throws Exception;
	
	//限制查询买家订单
	public List<Orders> limitFindOrdIts(int begin, int size) throws Exception;
	
	//根据订单编号查询订单
	public Orders findByOiid(int id) throws Exception;
	
	//删除订单
	public void deleteItem(int id) throws Exception;
}
