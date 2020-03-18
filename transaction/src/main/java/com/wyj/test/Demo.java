package com.wyj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wyj.service.UserService;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserService us = (UserService) ac.getBean("userService");
		us.transfer(1, 2, 500.0);
	}
}
