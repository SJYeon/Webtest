package com.service;

import com.beans.Users;
import com.dao.UserDao;

public interface UserService {

	public abstract boolean register(Users user);

	public abstract Users getUser();

	public abstract void setUser(Users user);

	public abstract UserDao getDao();

	public abstract void setDao(UserDao dao);

}