package com.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrdersDao;
import com.entity.Orders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestOrdersDaoImpl {

	@Resource(name="ordersDao")
	private OrdersDao ordersDao;
	
	@Transactional(propagation=Propagation.REQUIRED)
	@Test
	public void testSave(){
		Orders o =new Orders();
		o.setOrder_time("20");
		o.setTotal_price(50.8);
		o.setReceive_name("qwe");
		o.setAddress("hid");
		o.setMobile("dia");
		o.setPhone("123212");
		try {
			ordersDao.save(o);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Test
	public void testFindByUid(){
		List<Orders> list = null;
		try {
			list = ordersDao.findByUid(0);
			for(Orders o : list){
				System.out.println(o.getReceive_name());
				System.out.println(o.getAddress());
				System.out.println(o.getPhone());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
