package com.service.impl;
/**
 * @author Fu 
 */
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import com.beans.Users;
import com.common.MD5;
import com.dao.UserDao;
import com.service.UserService;

public class UserServiceImpl implements UserService {
	
		Users user;
		@Resource(name="userdao")
		UserDao dao;
		/* (non-Javadoc)
		 * @see com.service.impl.UserService#register(com.beans.Users)
		 */
		/**
		 * 用户注册
		 * @throws UnsupportedEncodingException 
		 * @throws NoSuchAlgorithmException 
		 */
		public boolean register(Users user){
			//用户密码md5加密过程
			try {	
				user.setPassword(MD5.md5(user.getPassword()));	
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int result = dao.addUser(user);
			return result==1?true:false;
		}
		/* (non-Javadoc)
		 * @see com.service.impl.UserService#getUser()
		 */
		public Users getUser() {
			return user;
		}
		/* (non-Javadoc)
		 * @see com.service.impl.UserService#setUser(com.beans.Users)
		 */
		public void setUser(Users user) {
			this.user = user;
		}
		/* (non-Javadoc)
		 * @see com.service.impl.UserService#getDao()
		 */
		public UserDao getDao() {
			return dao;
		}
		/* (non-Javadoc)
		 * @see com.service.impl.UserService#setDao(com.dao.UserDao)
		 */
		public void setDao(UserDao dao) {
			this.dao = dao;
		}
}
