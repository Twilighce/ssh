package com.Twilighce.registration.service.impl;

import javax.annotation.Resource;


import org.springframework.stereotype.Component;

import com.Twilighce.registration.dao.UserDao;
import com.Twilighce.registration.dao.impl.UserDaoImpl;
import com.Twilighce.registration.model.User;
import com.Twilighce.registration.service.UserManager;

@Component("userManager")
public class UserManagerImpl implements UserManager {
	
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	@Resource
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
