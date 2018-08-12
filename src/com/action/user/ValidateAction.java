package com.action.user;

import com.action.BaseAction;
import com.entity.User;
/**
 * 注册验证类
 */
public class ValidateAction extends BaseAction {

	private User user;
	private String repwd;
	private String checkCode;
	
	//处理密码验证
	public String execute() throws Exception{
		if(repwd == null){
			request.setAttribute("repwd_null", "请输入验证密码！");
			return "register_form";
		}else if(!repwd.equals(user.getPassword())){
			request.setAttribute("repwd_null", "两次输入的密码不一样！");
			return "register_form";
		}
		return "to_valiCode";
	}
	
	//处理验证码
	public String valiCheckCode(){
		if(checkCode != null && checkCode.equalsIgnoreCase(session.get("checkCode").toString())){
			return "to_userRegist";
		}else{
			request.setAttribute("code_fail", "验证码不对！");
			return "register_form";
		}
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRepwd() {
		return repwd;
	}
	public void setRepwd(String repwd) {
		this.repwd = repwd;
	}
	public String getCheckCode() {
		return checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	
}
