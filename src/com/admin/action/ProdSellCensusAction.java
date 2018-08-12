package com.admin.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.admin.service.ItemDetailService;
import com.dao.SellCensusDao;
import com.entity.SellBook;
import com.entity.SellCensus;

/**
 *��Ʒ����ͳ����
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class ProdSellCensusAction extends AdmPageAction {
	private List<SellBook> sellbooks;
	private List<SellCensus> sellbook;
	private double totalprice;
	private int id;
	
	@Resource(name="itemDetailService")
	private ItemDetailService itemDetailService;
	
	//��ת�����ۼ�¼�б�ҳ��
	@SuppressWarnings("unchecked")
	public String toSellBList() throws Exception{
		List<?> list = itemDetailService.getSellCensus(page, size);
		int pnum = (Integer) list.get(0);
		sellbooks = (List<SellBook>) list.get(1);
		for(SellBook sb : sellbooks)
			totalprice += sb.getAllprice();
		
		// �����Ŀ¼����ҳ��
		if (pnum == 0) {
			maxPage = 1;
		} else if (pnum % size == 0) {
			maxPage = pnum / size;
		} else {
			maxPage = pnum / size + 1;
		}
		return "to_sellBList";
	}
	
	//��ת��ָ���鼮���ۼ�¼
	@SuppressWarnings("unchecked")
	public String toSellBook() throws Exception{
		List<?> list = itemDetailService.getSellCensusByBid(id, page, size);
		int pnum = (Integer) list.get(0);
		sellbook = (List<SellCensus>) list.get(1);
		for(SellCensus sc : sellbook)
			totalprice += sc.getBuyAmount() * sc.getPrice();
		
		// �����Ŀ¼����ҳ��
		if (pnum == 0) {
			maxPage = 1;
		} else if (pnum % size == 0) {
			maxPage = pnum / size;
		} else {
			maxPage = pnum / size + 1;
		}
		return "to_sellB";
	}

	public List<SellBook> getSellbooks() {
		return sellbooks;
	}
	public void setSellbooks(List<SellBook> sellbooks) {
		this.sellbooks = sellbooks;
	}
	public List<SellCensus> getSellbook() {
		return sellbook;
	}
	public void setSellbook(List<SellCensus> sellbook) {
		this.sellbook = sellbook;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
