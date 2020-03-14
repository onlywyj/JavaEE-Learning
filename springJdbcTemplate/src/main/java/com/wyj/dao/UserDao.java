package com.wyj.dao;

import java.util.List;

import com.wyj.model.User;

public interface UserDao {
	
	
	public void insert(User user);
	
	public void delete(Integer id);
	
	public void update(User user);
	
	public User queryById(Integer id);
	
	public List<User> queryAllUser();

}


