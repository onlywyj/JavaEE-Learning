package com.wyj.service;


import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
	
	public void insert() {
		System.out.println("insert user");
	}
	public void delete() {
		System.out.println("delete user");
	}
	public void modify() {
		System.out.println("modify user");
	}
	public void search() {
		System.out.println("search user");
	}

}
