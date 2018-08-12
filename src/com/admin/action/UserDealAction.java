package com.admin.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.entity.SellCensus;
import com.entity.User;
import com.service.UserService;

/**
 * �û��鿴Action��
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDealAction extends AdmPageAction{
	private List<SellCensus> scss;
	private List<User> users;
	private User user;
	private int id;
	
	@Resource(name="userService")
	private UserService userService;
	
	//��ת���û��б�ҳ��
	@SuppressWarnings("unchecked")
	public String tousList() throws Exception{
		List<?> list = userService.getUsers(page, size);
		int pnum = (Integer) list.get(0);
		users = (List<User>) list.get(1);
		// �����Ŀ¼����ҳ��
		if (pnum == 0) {
			maxPage = 1;
		} else if (pnum % size == 0) {
			maxPage = pnum / size;
		} else {
			maxPage = pnum / size + 1;
		}
		return "to_usList";
	}
	
	//��ת��ָ���û���ϸ��Ϣҳ��
	@SuppressWarnings("unchecked")
	public String tousDetail() throws Exception{
		List<?> list = userService.getUser(id);
		user = (User) list.get(0);
		scss = (List<SellCensus>) list.get(1);
		return "to_usDetail";
	}

	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<SellCensus> getScss() {
		return scss;
	}

	public void setScss(List<SellCensus> scss) {
		this.scss = scss;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
