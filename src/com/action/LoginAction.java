package com.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.beans.Users;
import com.opensymphony.xwork2.ActionSupport;
import com.service.LoginService;

public class LoginAction extends ActionSupport {
	@Resource(name="loginservice")
	private	LoginService	service;
	private Users user;
	
	public String login(){
		
		Integer result=service.login(user.getName(), user.getPassword());

		if(result!=null){
			ServletActionContext.getRequest().getSession().setAttribute("username", user.getName());
			
			return "success";
		}
		else{
			
			return "fail";}
		
	}
	
	public LoginService getService() {
		return service;
	}
	
	public void setService(LoginService service) {
		this.service = service;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
}
