package com.action.item;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.action.BaseAction;
import com.entity.Item;
import com.entity.User;
import com.service.ItemService;
import com.util.FormatData;
/**
 * ��ת�����ﳵҳ��
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class ItemMoveAction extends BaseAction {
	private List<Item> items;
	private String totalPrice;
	
	@Resource(name="itemService")
	private ItemService itemService;
	
	//��ת�����ﳵ���ڹ��ﳵ���ų�����
	public String execute() throws Exception{
		User u = (User)session.get("s_user");
		items = itemService.getItems(u);
		double tp = 0;
		for(Item i : items)
			tp += i.getAmount();
		totalPrice = FormatData.price(tp);
		return "to_cartList";
	}
	
	//��ת��ȷ��ҳ��
	public String infoItem() throws Exception{
		User u = (User)session.get("s_user");
		items = itemService.getItems(u);
		double tp = 0;
		for(Item i : items)
			tp += i.getAmount();
		totalPrice = FormatData.price(tp);
		return "to_info";
	}

	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
}
