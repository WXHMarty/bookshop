package com.dao;

import java.util.List;

import com.entity.Item;

/**
 * 购物车DAO类
 */
public interface ItemDao {

	//保存购物车商品
	public void save(Item item) throws Exception;
	
	//根据用户ID查询购物车商品
	public List<Item> findByUid(int uid) throws Exception;
	
	//根据订单编号查询
	public Item findById(int itid) throws Exception;
	
	//修改订单数量
	public void update(Item item) throws Exception;
	
	//删除资料
	public boolean delete(int itid) throws Exception;
}
