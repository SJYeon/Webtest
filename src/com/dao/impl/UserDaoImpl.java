package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.UserDao;
import com.beans.*;
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public Users getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Users getByNameandPass(String name, String password) {
		// TODO Auto-generated method stub
	
		Object[] arg={name, password};
		//List<Users> list = (List<Users>) getSession().createQuery("from com.beans.Users u where u.name=? and u.password=?").setParameter(0, name).setParameter(1, password).list();
		List<Users> list =this.getHibernateTemplate().find(" from com.beans.Users u where u.name=? and u.password=?", arg); 
	
		if(list.size()==1){
			return (Users)list.get(0);
		}
		return null;
	}

	public int addUser(Users user) {
		// TODO Auto-generated method stub
		try{
		this.getHibernateTemplate().save(user);
		return 1;
		}
		catch(Exception e){
			return 0;
		}
	}
	
}
