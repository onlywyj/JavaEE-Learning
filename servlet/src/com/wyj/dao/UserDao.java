package com.wyj.dao;

import java.util.ArrayList;

import com.wyj.model.User;

public interface UserDao {
	
	//校验登录信息
	public boolean checkUser(User user);
	//获取全体用户的信息
	public ArrayList<User> getAllUser();
	//根据ID值获得单个用户的信息
	//根据ID值，删除单个用户的信息

}
