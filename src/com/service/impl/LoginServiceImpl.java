package com.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import com.beans.Users;
import com.common.MD5;
import com.dao.UserDao;
import com.service.LoginService;

public class LoginServiceImpl implements LoginService {
	private UserDao dao;


	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}


	public Integer login(String name, String password) {
		// TODO Auto-generated method stub
		//登陆密码md5加密过程
		try {
			password = MD5.md5(password);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Users user = dao.getByNameandPass(name, password);
		if(user != null){
			return user.getId();
		}
		return null;
	}

}
