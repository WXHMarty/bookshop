package com.action.user;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.action.BaseAction;
import com.dao.UserDao;
import com.daoImpl.UserDaoImpl;
import com.entity.User;
import com.service.UserService;
import com.util.Encrypt;
import com.util.FormatData;
/**
 * 用户注册Action类
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class UserRegisterAction extends BaseAction {
	private User user;
	
	@Resource(name="userService")
	private UserService userService;

	//跳转到用户注册页面
	public String execute() throws Exception{
		return "register_form";
	}
	
	//处理用户注册
	public String userRegist() throws Exception{
		User u = new User();
		u = userService.getUser(user.getUsername());
		if(u.getUsername() != null){
			request.setAttribute("regist_fail", "该用户已存在！");
			return "register_form";
		}
		String password = Encrypt.md5encrypt(user.getPassword());
		u.setUsername(user.getUsername());
		u.setPassword(password);
		u.setReg_time(FormatData.nowTime());
		u.setLast_login_ip(request.getRemoteAddr());
		u.setLast_login_time(FormatData.nowTime());
		User us = userService.saveUser(u);
		session.put("s_user", us);
		return "success";
	}
	
	//用户注册成功直接登录
	public String toMain(){
		return "to_main";
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
