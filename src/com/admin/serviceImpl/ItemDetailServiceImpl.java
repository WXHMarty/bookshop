package com.admin.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.service.ItemDetailService;
import com.dao.OrdersDao;
import com.dao.SellCensusDao;
import com.entity.Orders;
import com.entity.SellBook;
import com.entity.SellCensus;
/**
 * 订单处理service实现类
 */
public class ItemDetailServiceImpl implements ItemDetailService {

	private OrdersDao ordersDao;
	private SellCensusDao sellCensusDao;
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public List<Orders> getOrdItemAll() throws Exception {
		List<Orders> list = ordersDao.findOrdIts();
		return list;
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public List<Orders> getOrdItem(int page, int size) throws Exception {
		int begin = (page - 1) * size;
		List<Orders> list = ordersDao.limitFindOrdIts(begin, size);
		return list;
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public Orders getitById(int id) throws Exception {
		Orders it = ordersDao.findByOiid(id);
		return it;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void deleteIt(int id) throws Exception {
		ordersDao.deleteItem(id);
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@SuppressWarnings("unchecked")
	@Override
	public List<?> getSellCensus(int page, int size) throws Exception {
		List list = new ArrayList();
		int begin = (page - 1) * size;
		int pnum = 0;
		pnum = sellCensusDao.findAll().size();
		List<SellBook> sellbooks = sellCensusDao.limitFindAll(begin, size);
		list.add(pnum);
		list.add(sellbooks);
		return list;
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@SuppressWarnings("unchecked")
	@Override
	public List<?> getSellCensusByBid(int bid, int page, int size)
			throws Exception {
		List list = new ArrayList();
		int begin = (page - 1) * size;
		int pnum = 0;
		pnum = sellCensusDao.findByBid(bid).size();
		List<SellCensus> sellbook = sellCensusDao.limitFindByBid(bid, begin, size);
		list.add(pnum);
		list.add(sellbook);
		return list;
	}

	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}

	public void setSellCensusDao(SellCensusDao sellCensusDao) {
		this.sellCensusDao = sellCensusDao;
	}

}
