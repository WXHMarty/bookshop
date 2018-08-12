package com.action.item;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.action.BaseAction;
import com.entity.Book;
import com.entity.Item;
import com.entity.User;
import com.service.ItemService;
/**
 * 更改数量
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class ItemAction extends BaseAction {
	private int id;
	private Book book;
	private List<Item> items;
	
	private int itid;
	private int num;
	
	@Resource(name="itemService")
	private ItemService itemService;
	
	//储存购物车
	public String saveItem() throws Exception{
		User u = (User) session.get("s_user");
		book = itemService.saveItem(u, id);
		request.setAttribute("result",
			"<a href=\"/bookshop/item/ItemMove_execute\""
			+ ">成功加入购物车，可以到购物车查看和结算！</a>");
		return "to_bookview";
	}
	
	//修改购物车订单数量
	public String execute() throws Exception{
		itemService.updateItem(itid, num);
		return "success";
	}
	
	
	//删除购物车单条订单
	public String deleteItem() throws Exception{
		itemService.deleteItem(itid);
		return "success";
	}
	
	//删除购物车全部订单
	public String clearItem() throws Exception {
		User u = (User)session.get("s_user");
		itemService.deleteAllItem(u);
		return "to_cartList";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public int getItid() {
		return itid;
	}
	public void setItid(int itid) {
		this.itid = itid;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
