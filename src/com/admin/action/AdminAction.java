package com.admin.action;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.action.BaseAction;
import com.admin.entity.Admin;
import com.admin.service.AdminService;
import com.util.Encrypt;

/**
 * ����ԱAction
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class AdminAction extends BaseAction{
	private Admin admin = null;
	private String cpass;//������
	private String npass;//������
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	//��ת������Ա��½ҳ��
	public String execute() throws Exception{
		return "login";
	}

	//����Ա��½����
	public String adminLogin() throws Exception{
		if(admin == null || admin.getName() == null ||
				admin.getPassword() == null){
			return "admin_login";
		}
		String password = Encrypt.md5encrypt(admin.getPassword());
		System.out.println(admin.getName()+"sasf");
		Admin a = adminService.getAdm(admin);
		if(a == null || !a.getPassword().equals(password)){
			request.setAttribute("error", "�û��������벻��ȷ��");
			return "admin_login";
		}else{
			session.put("book_admin", a);
			return "main";
		}
	}

	//��ת����ҳ
	public String toMain(){
		return "main";
	}

	//��ת����������Աҳ��
	public String toAddAdm() throws Exception{
		return "to_add";
	}

	//��������Ա
	public String add() throws Exception{
		Admin a = new Admin();
		System.out.println("action����Ա���֣�"+admin.getName());
		System.out.println("action����Ա���룺"+admin.getPassword());
		a = adminService.getAdm(admin);
		if(a == null){
			adminService.saveAdm(admin);
			return "addAdm_ok";
		}
		request.setAttribute("add_error", "�ù���Ա�Ѿ����ڣ�");
		return "to_add";
	}

	//��ת���޸�����ҳ��
	public String toRevPasss() {
		return "to_revpass";
	}

	//���������޸Ĵ���
	public String revPass() throws Exception{
		Admin a = (Admin) session.get("book_admin");
		String cpassword = Encrypt.md5encrypt(cpass);
		//���ԭ�����벻��ȷ�������޸�
		if(!a.getPassword().equals(cpassword)){
			request.setAttribute("fail", "���벻��ȷ���޸�ʧ�ܣ�");
			return "to_revpass";
		}
		//���ԭ������ȷ��������޸Ĳ���
		String password = Encrypt.md5encrypt(npass);
		a.setPassword(password);
		adminService.updateAdm(a);
		return "revPass_ok";
	}

	//����Ա�˳���¼
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
