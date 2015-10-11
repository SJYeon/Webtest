package com.dao;

import com.beans.Users;

public interface UserDao {
	Users getById(Integer id);
	Users getByNameandPass(String name,String password);
	int addUser(Users user);
}
