package com.maven.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.maven.service.UserService;

//配置Spring中的测试环境
@RunWith(SpringJUnit4ClassRunner.class) 
//指定Spring的配置文件路径 
@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml"})

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
