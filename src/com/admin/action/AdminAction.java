package com.admin.action;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.action.BaseAction;
import com.admin.entity.Admin;
import com.admin.service.AdminService;
import com.util.Encrypt;

/**
 * 管理员Action
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class AdminAction extends BaseAction{
	private Admin admin = null;
	private String cpass;//旧密码
	private String npass;//新密码
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	//跳转到管理员登陆页面
	public String execute() throws Exception{
		return "login";
	}

	//管理员登陆处理
	public String adminLogin() throws Exception{
		if(admin == null || admin.getName() == null ||
				admin.getPassword() == null){
			return "admin_login";
		}
		String password = Encrypt.md5encrypt(admin.getPassword());
		System.out.println(admin.getName()+"sasf");
		Admin a = adminService.getAdm(admin);
		if(a == null || !a.getPassword().equals(password)){
			request.setAttribute("error", "用户名或密码不正确！");
			return "admin_login";
		}else{
			session.put("book_admin", a);
			return "main";
		}
	}

	//跳转到主页
	public String toMain(){
		return "main";
	}

	//跳转到新增管理员页面
	public String toAddAdm() throws Exception{
		return "to_add";
	}

	//新增管理员
	public String add() throws Exception{
		Admin a = new Admin();
		System.out.println("action管理员名字："+admin.getName());
		System.out.println("action管理员密码："+admin.getPassword());
		a = adminService.getAdm(admin);
		if(a == null){
			adminService.saveAdm(admin);
			return "addAdm_ok";
		}
		request.setAttribute("add_error", "该管理员已经存在！");
		return "to_add";
	}

	//跳转到修改密码页面
	public String toRevPasss() {
		return "to_revpass";
	}

	//进行密码修改处理
	public String revPass() throws Exception{
		Admin a = (Admin) session.get("book_admin");
		String cpassword = Encrypt.md5encrypt(cpass);
		//如果原来密码不正确，则不能修改
		if(!a.getPassword().equals(cpassword)){
			request.setAttribute("fail", "密码不正确，修改失败！");
			return "to_revpass";
		}
		//如果原密码正确，则进行修改操作
		String password = Encrypt.md5encrypt(npass);
		a.setPassword(password);
		adminService.updateAdm(a);
		return "revPass_ok";
	}

	//管理员退出登录
	public String loginOut(){
		session.clear();
		return "login";
	}

	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public String getNpass() {
		return npass;
	}
	public void setNpass(String npass) {
		this.npass = npass;
	}
}
