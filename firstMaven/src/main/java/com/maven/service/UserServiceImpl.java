package com.maven.service;

import com.maven.dao.UserDao;
import com.maven.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao; //= new UserDaoImpl(); 传统的写法


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void insert() {
		
		userDao.insert();

	}

	@Override
	public void delete() {
		
		userDao.delete();

	}

	@Override
	public void modify() {
		
		userDao.modify();
		
	}

	@Override
	public void search() {

		userDao.search();

	}

}
