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
 * ���ﳵ����Serviceʵ����
 */
public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;
	private BookDao bookDao;
	
	//���湺�ﳵ������
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

	//�޸Ĺ��ﳵ��������
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void updateItem(int itid, int num) throws Exception {
		Item i = itemDao.findById(itid);
		i.setOrder_num(num);
		i.setAmount(i.getPrice()*num);
		itemDao.update(i);
	}

	//ɾ�����ﳵ��������
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void deleteItem(int itid) throws Exception {
		itemDao.delete(itid);
	}

	//ɾ�����ﳵȫ������
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void deleteAllItem(User u) throws Exception {
		List<Item> its = itemDao.findByUid(u.getUid());
		for(Item i : its){
			itemDao.delete(i.getItid());
		}
	}

	//��ȡ���ﳵ����
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
