package com.Twilighce.registration.dao;

import com.Twilighce.registration.model.User;

public interface UserDao {
	public void save(User u);
	public boolean checkUserExistsWithName(String username);  
}
