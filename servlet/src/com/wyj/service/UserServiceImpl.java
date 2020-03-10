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

	public ArrayList<User> getAllUsers() {
		
		return userDao.getAllUsers();
	}
	
	@Override
	public boolean addUser(User user) {
		
		return userDao.addUser(user);
	}
	
	@Override
	public boolean deleteUser(User user) {
		
		return userDao.deleteUser(user);
	}

	public boolean modifyUser(User user) {
		return userDao.modifyUser(user);
	}

	public User findUserById(String id) {
		return userDao.findUserById(id);
	}

	public boolean deleteUserBySelected(String para2) {
		return userDao.deleteUserBySelected(para2);
	}

	public ArrayList<User> getAllUsersByPage(int currentPage, int pageSize) {
		return userDao.getAllUsersByPage(currentPage, pageSize);
	}

	public Integer getUserCount() {
		return userDao.getUserCount();
	}

	
	
}
