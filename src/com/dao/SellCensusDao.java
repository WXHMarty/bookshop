package com.dao;

import java.util.List;

import com.entity.SellBook;
import com.entity.SellCensus;

/**
 * 购买记录Dao层
 */
public interface SellCensusDao {
	//保存购买记录
	public void saveSellCensus(SellCensus sc) throws Exception;
	
	//根据用户查询购买记录
	public List<SellCensus> findByUser(int uid) throws Exception;
	
	//查询所有书籍销售记录
	public List<SellBook> findAll() throws Exception;
	
	//分页查询所有书籍销售记录
	public List<SellBook> limitFindAll(int begin, int size) throws Exception;
	
	//通过bid查询销售书籍
	public List<SellCensus> findByBid(int bid) throws Exception;
	
	//通过bid查询销售书籍
	public List<SellCensus> limitFindByBid(int bid, int begin, int size) throws Exception;
	
}
