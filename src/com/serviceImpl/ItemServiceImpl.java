package com.serviceImpl;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BookDao;
import com.dao.ItemDao;
import com.entity.Book;
import com.entity.Item;
import com.entity.User;
import com.service.ItemService;
/**
 * 购物车订单Service实现类
 */
public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;
	private BookDao bookDao;
	
	//保存购物车定订单
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public Book saveItem(User u, int id) throws Exception {
		Book book = bookDao.findBookById(id);
		Item item = new Item();
		System.out.println("bookname:"+book.getBname());
		item.setItname(book.getBname());
		item.setItpicture(book.getPicture());
		item.setPrice(book.getPrice());
		item.setOrder_num(1);
		item.setAmount(book.getPrice()*item.getOrder_num());
		item.setBid(book.getBid());
		item.setUser(u);
		itemDao.save(item);
		return book;
	}

	//修改购物车订单数量
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void updateItem(int itid, int num) throws Exception {
		Item i = itemDao.findById(itid);
		i.setOrder_num(num);
		i.setAmount(i.getPrice()*num);
		itemDao.update(i);
	}

	//删除购物车单个订单
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void deleteItem(int itid) throws Exception {
		itemDao.delete(itid);
	}

	//删除购物车全部订单
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void deleteAllItem(User u) throws Exception {
		List<Item> its = itemDao.findByUid(u.getUid());
		for(Item i : its){
			itemDao.delete(i.getItid());
		}
	}

	//获取购物车订单
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public List<Item> getItems(User u) throws Exception {
		List<Item> items = itemDao.findByUid(u.getUid());
		return items;
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

}
