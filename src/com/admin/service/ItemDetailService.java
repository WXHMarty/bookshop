package com.admin.service;

import java.util.List;

import com.entity.Orders;

/**
 * 订单处理service
 */
public interface ItemDetailService {
	
	//获取全部订单
	public List<Orders> getOrdItemAll() throws Exception;
	
	//限制获取订单
	public List<Orders> getOrdItem(int page, int size) throws Exception;

	//通过id获取一个订单
	public Orders getitById(int id) throws Exception;
	
	//删除订单
	public void deleteIt(int id) throws Exception;
	
	//获取销售记录
	public List<?> getSellCensus(int page, int size) throws Exception;
	
	//根据书籍id获取销售记录
	public List<?> getSellCensusByBid(int bid, int page, int size) throws Exception;
	
}
