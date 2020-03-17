package com.wyj.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wyj.dao.UserDao;
@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=false)
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	
	public void transfer(Integer outUser, Integer inUser, Double money) {
		
		//从某个账户取出钱，减少
		userDao.withdraw(outUser, money);
		//把钱增加到另一个账户
		userDao.deposit(inUser, money);

	}
	

}
