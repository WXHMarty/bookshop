package com.dao;

import com.entity.SellBook;

/**
 * 销售记录Dao接口
 */
public interface SellBookDao {
	//通过书籍ID查询书籍
	public SellBook findByBid(int bid) throws Exception;
	
	//保存记录
	public void saveSellBook(SellBook sb) throws Exception;
	
	//更改记录
	public void updateSellBook(SellBook sb) throws Exception;
}
