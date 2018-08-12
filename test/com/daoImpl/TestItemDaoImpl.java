package com.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ItemDao;
import com.entity.Item;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestItemDaoImpl {

	@Resource(name="itemDao")
	private ItemDao itemDao;
	
	@Transactional(propagation=Propagation.REQUIRED)
	@Test
	public void TestSave(){
		Item i = new Item();
		i.setItname("ajkoj");
		i.setItpicture("ahdjkl");
		i.setPrice(56.0);
		i.setOrder_num(2);
		i.setAmount(112.0);
		try {
			itemDao.save(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	@Test
	public void testDelete(){
		try {
			itemDao.delete(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Test
	public void testfindByUid(){
		try {
			List<Item> items = itemDao.findByUid(1);
			for(Item i : items)
				System.out.println(i.getItname());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
