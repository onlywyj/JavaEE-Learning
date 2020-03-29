package com.wyj.service;

import java.util.ArrayList;

import com.wyj.model.User;

public interface UserService {

		//校验登录信息
		public boolean checkUser(User user);
		
		//获取全体用户的信息
		public ArrayList<User> getAllUsers();

		//添加用户信息
		public boolean addUser(User user);
		
		//根据ID值，删除单个用户的信息
		public boolean deleteUser(User user);
		
		//批量删除用户信息
		public boolean deleteUserBySelected(String para2);
		
		//修改用户信息
		public boolean modifyUser(User user);
		
		//按照用户ID值查询相关用户
		public User findUserById(String id);
		
		//按照Name的值查询用户
		public ArrayList<User> findUserByName(String username);	
		
		//增加分页代码
		public ArrayList<User> getAllUsersByPage(int currentPage, int pageSize);
		
		//分页数据查询方法
		public Integer getUserCount();
}
