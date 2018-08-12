package com.action.user;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.action.BaseAction;
import com.entity.User;
import com.service.UserService;
import com.util.Encrypt;
import com.util.FormatData;
/**
 * 用户登录Action类
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class UserLoginAction extends BaseAction {
	private User user;
	
	@Resource(name="userService")
	private UserService userService;

	//跳转至用户登录页面
	public String execute() throws Exception{
		return "login_form";
	}
		
	//处理用户登录
	public String userLogin() throws Exception{
		User u = userService.getUser(user.getUsername());
		System.out.println(u.getUsername());
		//如果用户名不正确，返回登录页面，并给出提示
		if(u.getUsername() == null){
			request.setAttribute("login_null","用户名不正确！");
			return "login_form";
		}
		//如果密码不正确，返回登录页面，并给出提示
		String password = Encrypt.md5encrypt(user.getPassword());
		if(!u.getPassword().equals(password)){
			request.setAttribute("login_err", "密码不正确！");
			return "login_form";
		}
			
		//更新last_login_time和last_login_ip字段
		u.setLast_login_ip(request.getRemoteAddr());
		u.setLast_login_time(FormatData.nowTime());
		userService.updateUser(u);
		session.put("s_user", u);
		return "to_main";
	}
	
	//退出登录
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
