package com.wyj.service;

public interface UserService {

	//转账
	public void transfer(Integer outUser,Integer inUser, Double money);
}
