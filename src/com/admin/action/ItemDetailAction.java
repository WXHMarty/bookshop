package com.admin.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.admin.service.ItemDetailService;
import com.entity.Orders;

/**
 * ����������
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class ItemDetailAction extends AdmPageAction{
	private List<Orders> items;
	private int id;
	private Orders item;
	
	@Resource(name="itemDetailService")
	private ItemDetailService itemDetailService;

	//��ת�������б�ҳ��
	public String toItList() throws Exception{
		int pnum = itemDetailService.getOrdItemAll().size();
		items = itemDetailService.getOrdItem(page, size);
		
		// �����Ŀ¼����ҳ��
		if (pnum == 0) {
			maxPage = 1;
		} else if (pnum % size == 0) {
			maxPage = pnum / size;
		} else {
			maxPage = pnum / size + 1;
		}
		return "to_list";
	}
	
	//��ת��ָ���Ķ���ҳ��
	public String toItem() throws Exception{
		item = itemDetailService.getitById(id);
		return "to_item";
	}
	
	//������
	public String doItem() throws Exception{
		itemDetailService.deleteIt(id);
		return "do_ok";
	}

	public List<Orders> getItems() {
		return items;
	}
	public void setItems(List<Orders> items) {
		this.items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Orders getItem() {
		return item;
	}
	public void setItem(Orders item) {
		this.item = item;
	}
}
