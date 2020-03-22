package com.wyj.test;

import org.junit.jupiter.api.Test;

import com.wyj.cglib.CglibProxy;
import com.wyj.cglib.UserDao;

public class Demo2 {
	
	@Test
	//Spring AOP CGLIB
	public void run2() {
		
		//创建代理对象
		CglibProxy cglibProxy = new CglibProxy();		
		//创建目标对象
		UserDao userDao = new UserDao();
		//获取增强后的目标对象
		UserDao userDaol = (UserDao) cglibProxy.createProxy(userDao);
		//执行方法
		userDaol.addUser();
		userDaol.deleteUser();		
				
	}
	
	

}