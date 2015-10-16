package com.intercopter;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class IntercopterTest extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		
		String username =  (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		
		
		if(username == "" || "".equals(username) || username == null){
			return "login";
		}
		else{
		return arg0.invoke();
		}
	}

}
