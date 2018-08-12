package com.action.user;

import com.action.BaseAction;
import com.entity.User;
/**
 * ע����֤��
 */
public class ValidateAction extends BaseAction {

	private User user;
	private String repwd;
	private String checkCode;
	
	//����������֤
	public String execute() throws Exception{
		if(repwd == null){
			request.setAttribute("repwd_null", "��������֤���룡");
			return "register_form";
		}else if(!repwd.equals(user.getPassword())){
			request.setAttribute("repwd_null", "������������벻һ����");
			return "register_form";
		}
		return "to_valiCode";
	}
	
	//������֤��
	public String valiCheckCode(){
		if(checkCode != null && checkCode.equalsIgnoreCase(session.get("checkCode").toString())){
			return "to_userRegist";
		}else{
			request.setAttribute("code_fail", "��֤�벻�ԣ�");
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
