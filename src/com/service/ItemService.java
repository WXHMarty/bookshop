package com.service;

import java.util.List;

import com.entity.Book;
import com.entity.Item;
import com.entity.User;

/**
 * 购物车Service接口
 */
public interface ItemService {
	//保存购物车订单
	public Book saveItem(User u, int id) throws Exception;
	
	//修改购物车订单数量
	public void updateItem(int itid, int num) throws Exception;
	
	//删除单条购物车订单
	public void deleteItem(int itid) throws Exception;
	
	//删除全部购物车订单
	public void deleteAllItem(User u) throws Exception;
	
	//获取购物车订单
	public List<Item> getItems(User u) throws Exception;
}
