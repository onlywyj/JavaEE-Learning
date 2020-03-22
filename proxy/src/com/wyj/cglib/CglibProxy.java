package com.wyj.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	
	public Object createProxy(Object target) {
		
		//创建一个动态类对象
		Enhancer enhancer = new Enhancer();
		
		enhancer.setSuperclass(target.getClass());
		
		enhancer.setCallback(this);
				
		return enhancer.create();
		
	}
	
	/**
	 * proxy CGlib根据指定父类生成的代理对象
	 * method拦截的方法
	 * args拦截方法的参数数组
	 * methodProxy方法的代理对象，用于执行父类的方法
	 */
		
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		
		//前增强
		System.out.println("开启事务");
		System.out.println("记录日志");
		//执行目标函数
		Object object = arg3.invokeSuper(arg0, arg2); 
		//后增强
		System.out.println("记录日志关闭");
		System.out.println("事务关闭");
		return object;
	}

}
