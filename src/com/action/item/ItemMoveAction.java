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
 * 跳转到购物车页面
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class ItemMoveAction extends BaseAction {
	private List<Item> items;
	private String totalPrice;
	
	@Resource(name="itemService")
	private ItemService itemService;
	
	//跳转到购物车，在购物车中排出订单
	public String execute() throws Exception{
		User u = (User)session.get("s_user");
		items = itemService.getItems(u);
		double tp = 0;
		for(Item i : items)
			tp += i.getAmount();
		totalPrice = FormatData.price(tp);
		return "to_cartList";
	}
	
	//跳转到确认页面
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
