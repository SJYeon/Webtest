package com.action;
/**
 * @author Fu
 * 用户操作Action
 */
import com.beans.Users;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class UserAction extends ActionSupport {
			UserService service;
			Users user;
	
			//用户注册函数
			public String register(){
				return service.register(user)?"success":"fail";
			}

			public UserService getService() {
				return service;
			}

			public void setService(UserService service) {
				this.service = service;
			}

			public Users getUser() {
				return user;
			}

			public void setUser(Users user) {
				this.user = user;
			}
}
