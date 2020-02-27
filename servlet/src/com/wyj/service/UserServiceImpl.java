package com.wyj.service;

import java.util.ArrayList;

import com.wyj.dao.UserDao;
import com.wyj.dao.UserDaoImpl;
import com.wyj.model.User;

public class UserServiceImpl implements UserService {
	
	
	private UserDao userDao = new UserDaoImpl(); //动态多态性


	public boolean checkUser(User user) {
		
		return userDao.checkUser(user);
	}

	public ArrayList<User> getAllUser() {
		
		return userDao.getAllUser();
	}

}
