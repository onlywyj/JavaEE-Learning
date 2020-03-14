package com.wyj.test;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

import com.wyj.dao.UserDao;
import com.wyj.dao.UserDaoImpl;
import com.wyj.model.User;

public class Demo {
	
	@Test
	public void run() {
		
		UserDao ud = new UserDaoImpl();
		
		User user = new User();
		
		user.setUserName("testUser");
		
		user.setPassword("123");
		
		user.setEmail("test@139.com");
		
		user.setIdentity("admin");
		
		//ud.insert(user);
		
		//System.out.println(ud.queryById(4));
		
		ArrayList<User> all = (ArrayList<User>) ud.queryAllUser();
		
		Iterator<User> it = all.iterator();
		
		while (it.hasNext()) {
			User u = it.next();
			System.out.println(u);
		}
	}

}
