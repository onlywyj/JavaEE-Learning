package com.wyj.test;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wyj.dao.UserDao;
import com.wyj.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo2 {

	@Resource(name="userDao")
	private UserDao userDao;
	@Test
	public void run() {
		//System.out.println(userDao.queryById(4));
		
		ArrayList<User> all = (ArrayList<User>) userDao.queryAllUser();
		
		Iterator<User> it = all.iterator();
		
		while (it.hasNext()) {
			User u = it.next();
			System.out.println(u);
		}
	}
}
