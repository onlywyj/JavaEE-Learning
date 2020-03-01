package com.maven.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maven.service.UserService;
import com.maven.service.UserServiceImpl;

public class Demo {
	
		
	@Test
	public void run(){

		//System.out.println("junit test run...");
		
		//传统的写法
		/*
		UserService us = new UserServiceImpl();
		us.insert();
		us.delete();
		us.modify();
		us.search();				
		*/
		
		//新的方法
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
		UserService us = (UserService) ac.getBean("userService");
		us.insert();
		us.delete();
		us.modify();
		us.search();	
	}

}
