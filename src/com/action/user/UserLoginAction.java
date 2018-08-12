package com.action.user;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.action.BaseAction;
import com.entity.User;
import com.service.UserService;
import com.util.Encrypt;
import com.util.FormatData;
/**
 * �û���¼Action��
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class UserLoginAction extends BaseAction {
	private User user;
	
	@Resource(name="userService")
	private UserService userService;

	//��ת���û���¼ҳ��
	public String execute() throws Exception{
		return "login_form";
	}
		
	//�����û���¼
	public String userLogin() throws Exception{
		User u = userService.getUser(user.getUsername());
		System.out.println(u.getUsername());
		//����û�������ȷ�����ص�¼ҳ�棬��������ʾ
		if(u.getUsername() == null){
			request.setAttribute("login_null","�û�������ȷ��");
			return "login_form";
		}
		//������벻��ȷ�����ص�¼ҳ�棬��������ʾ
		String password = Encrypt.md5encrypt(user.getPassword());
		if(!u.getPassword().equals(password)){
			request.setAttribute("login_err", "���벻��ȷ��");
			return "login_form";
		}
			
		//����last_login_time��last_login_ip�ֶ�
		u.setLast_login_ip(request.getRemoteAddr());
		u.setLast_login_time(FormatData.nowTime());
		userService.updateUser(u);
		session.put("s_user", u);
		return "to_main";
	}
	
	//�˳���¼
	public String loginOut(){
		session.clear();
		return "login_form";
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
