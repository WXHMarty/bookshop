package com.admin.action;

import com.action.BaseAction;
/**
 * 管理员分页Action
 */
public class AdmPageAction extends BaseAction {
	protected int page = 1;//默认显示第一页
	protected int size = 10;//每页显示的条数
	protected int maxPage = 1;//默认最多的页数
	
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
