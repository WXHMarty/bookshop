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
 * ��������
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
	
	//���湺�ﳵ
	public String saveItem() throws Exception{
		User u = (User) session.get("s_user");
		book = itemService.saveItem(u, id);
		request.setAttribute("result",
			"<a href=\"/bookshop/item/ItemMove_execute\""
			+ ">�ɹ����빺�ﳵ�����Ե����ﳵ�鿴�ͽ��㣡</a>");
		return "to_bookview";
	}
	
	//�޸Ĺ��ﳵ��������
	public String execute() throws Exception{
		itemService.updateItem(itid, num);
		return "success";
	}
	
	
	//ɾ�����ﳵ��������
	public String deleteItem() throws Exception{
		itemService.deleteItem(itid);
		return "success";
	}
	
	//ɾ�����ﳵȫ������
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
