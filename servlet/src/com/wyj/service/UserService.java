package com.wyj.service;

import java.util.ArrayList;

import com.wyj.model.User;

public interface UserService {

		//校验登录信息
		public boolean checkUser(User user);
		//获取全体用户的信息
		public ArrayList<User> getAllUser();

		//添加用户信息
		public boolean addUser(User user);
		//根据ID值，删除单个用户的信息
		public boolean deleteUser(User user);
		//修改用户信息
		//public boolean modifyUser(User user);
		//按照用户ID值查询相关用户
		//public User findUserById(Integer id);
		//按照Name的值查询用户
		//public User findUserByName(String name);
}
