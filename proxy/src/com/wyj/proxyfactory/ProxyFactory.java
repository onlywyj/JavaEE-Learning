package com.wyj.proxyfactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.wyj.service.UserService;
import com.wyj.service.UserServiceImpl;

public class ProxyFactory implements InvocationHandler {
	
	private UserService us;

	public ProxyFactory(UserService us) {
		super();
		this.us = us;
	}

	public UserService getUserServiceFactory() {
		
		UserService us = (UserService) Proxy.newProxyInstance(this.getClass().getClassLoader(), UserServiceImpl.class.getInterfaces(), this);
		
		return us;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("开启事务");
		System.out.println("记录日志");
		method.invoke(us, args);
		System.out.println("记录日志关闭");
		System.out.println("事务关闭");
		return null;
	}

}
