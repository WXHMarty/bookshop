package com.admin.action;

import com.action.BaseAction;
/**
 * ����Ա��ҳAction
 */
public class AdmPageAction extends BaseAction {
	protected int page = 1;//Ĭ����ʾ��һҳ
	protected int size = 10;//ÿҳ��ʾ������
	protected int maxPage = 1;//Ĭ������ҳ��
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
}
