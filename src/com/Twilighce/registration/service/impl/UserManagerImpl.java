package com.Twilighce.registration.service.impl;

import com.Twilighce.registration.dao.UserDao;
import com.Twilighce.registration.dao.impl.UserDaoImpl;
import com.Twilighce.registration.model.User;
import com.Twilighce.registration.service.UserManager;

public class UserManagerImpl implements UserManager {
	
	private UserDao userDao = new UserDaoImpl();
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public boolean exists(User u) throws Exception {
		return userDao.checkUserExistsWithName(u.getUsername());
		
	}
	
	public void add(User u) throws Exception {
		userDao.save(u);
	}
}
