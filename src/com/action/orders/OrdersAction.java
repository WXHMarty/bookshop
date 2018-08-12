package com.action.orders;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.action.BaseAction;
import com.entity.Orders;
import com.entity.User;
import com.service.OrdersService;

/**
 * ���ջ��ͻ�Action��
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class OrdersAction extends BaseAction{
	private Orders order;
	
	@Resource(name="ordersService")
	private OrdersService ordersService;
	
	//��ת����д��ַҳ��
	public String execute() throws Exception{
		return "to_address";
	}
	
	//ע����д�ջ���Ϣ
	public String consignee() throws Exception{
		User user = (User)session.get("s_user");
		boolean flag = ordersService.saveOrd(order, user);
		if(flag) return "success";
		else return "fail";
	}
	
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}

}
