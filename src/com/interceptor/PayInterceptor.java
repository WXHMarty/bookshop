package com.interceptor;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.entity.Item;
import com.entity.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.service.ItemService;

/**
 * Ω·À„¿πΩÿ∆˜
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class PayInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="itemService")
	private ItemService itemService;
	
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Map<String,Object> session = arg0.getInvocationContext().getSession();
		User user = (User) session.get("s_user");
		List<Item> items = null;
		items = itemService.getItems(user);
		if(items != null && items.size() != 0){
			System.out.println();
		}else {
			return "fail";
		}
		return arg0.invoke();
	}
	
}
