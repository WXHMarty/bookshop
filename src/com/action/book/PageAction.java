package com.action.book;

import com.action.BaseAction;
/**
 * 分页Action
 */
public class PageAction extends BaseAction {
	protected int page = 1;//默认显示第一页
	protected int size = 5;//每页显示的条数
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
