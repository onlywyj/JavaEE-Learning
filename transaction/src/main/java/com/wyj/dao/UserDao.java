package com.wyj.dao;

public interface UserDao {

	//存款
	public void deposit(Integer id,Double money);
	//取款
	public void withdraw(Integer id,Double money);
}
