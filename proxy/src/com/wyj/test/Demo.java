package com.wyj.test;

import org.junit.jupiter.api.Test;

import com.wyj.proxyfactory.ProxyFactory;
import com.wyj.service.UserService;
import com.wyj.service.UserServiceImpl;

public class Demo {
	
	@Test
	//Spring AOP
	public void run() {
		
		//1、获取目标对象
		UserService us = new UserServiceImpl();
		//2.获代理工厂
		ProxyFactory factory = new ProxyFactory(us);
		//3、通过工厂获取代理对象
		UserService proxy = factory.getUserServiceFactory();
		//4、通过代理对象执行操作
		proxy.insert();
		System.out.println("---------------------");
		proxy.delete();				
	}
	
	

}
