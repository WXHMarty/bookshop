package com.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ItemDao;
import com.dao.OrdersDao;
import com.dao.SellBookDao;
import com.dao.SellCensusDao;
import com.entity.ItProd;
import com.entity.Item;
import com.entity.Orders;
import com.entity.SellBook;
import com.entity.SellCensus;
import com.entity.User;
import com.service.OrdersService;
import com.util.FormatData;

public class OrdersServiceImpl implements OrdersService {

	private OrdersDao ordersDao;
	private ItemDao itemDao;
	private SellBookDao sellBookDao;
	private SellCensusDao sellCensusDao;
	
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public boolean saveOrd(Orders order, User user) throws Exception {
		int uid = user.getUid();
		List<Item> items = itemDao.findByUid(uid);
		if(items.size() != 0){
			Set<ItProd> ips = new HashSet<ItProd>();
			
			
			double totalPrice = 0;
			String time = FormatData.nowmTime();
			for(Item i : items){
				SellCensus sc = new SellCensus();
				SellBook sb = null;
				ItProd ip = new ItProd();
				ip.setProname(i.getItname());
				ip.setPro_num(i.getOrder_num());
				ips.add(ip);
				totalPrice += i.getAmount();
				sb = sellBookDao.findByBid(i.getBid());
				if(sb == null){
					System.out.println("所要保存的书籍编号"+i.getBid());
					sb = new SellBook();
					sb.setBid(i.getBid());
					sb.setSellbname(i.getItname());
					sb.setPrice(i.getPrice());
					sb.setSellAmount(i.getOrder_num());
					sb.setAllprice(i.getPrice() * i.getOrder_num());
					sellBookDao.saveSellBook(sb);
					sb = null;
				}else{
					sb.setAllprice(sb.getAllprice()+i.getPrice()*i.getAmount());
					sellBookDao.saveSellBook(sb);
					sb = null;
				}
				sc.setPurchaser_id(user.getUid());
				sc.setPurchaser(user.getUsername());
				sc.setSellBook_id(i.getBid());
				sc.setSellBook(i.getItname());
				sc.setSellTime(time);
				sc.setPrice(i.getPrice());
				sc.setBuyAmount(i.getOrder_num());
				sellCensusDao.saveSellCensus(sc);
			}
			
			//保存订单
			Orders o = new Orders();
			o.setOrder_time(time);
			o.setTotal_price(totalPrice);
			o.setOrd_num(System.currentTimeMillis());
			o.setReceive_name(order.getReceive_name());
			o.setAddress(order.getAddress());
			o.setZipCode(order.getZipCode());
			o.setPhone(order.getPhone());
			o.setMobile(order.getMobile());
			o.setUser(user);
			o.setOrdits(ips);
			ordersDao.save(o);
			
			//删除购物车中的商品
			for(Item i : items){
				itemDao.delete(i.getItid());
			}
			return true;
		}else{
			return false;
		}
	}

	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	public void setSellBookDao(SellBookDao sellBookDao) {
		this.sellBookDao = sellBookDao;
	}
	public void setSellCensusDao(SellCensusDao sellCensusDao) {
		this.sellCensusDao = sellCensusDao;
	}
}
