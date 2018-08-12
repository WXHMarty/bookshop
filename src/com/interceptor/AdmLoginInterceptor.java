package com.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AdmLoginInterceptor extends AbstractInterceptor{
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Map<String,Object> session = arg0.getInvocationContext().getSession();
		if(session.get("book_admin") == null){
			return "login";
		}
		return arg0.invoke();
	}
	
	
}
