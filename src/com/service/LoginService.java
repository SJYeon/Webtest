package com.service;

import com.dao.UserDao;

public interface LoginService {
	
		public UserDao getDao();
		public void setDao(UserDao dao);
		public Integer login(String name, String password);
}
