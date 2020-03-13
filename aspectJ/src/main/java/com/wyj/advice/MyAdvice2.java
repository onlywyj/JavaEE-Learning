package com.wyj.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MyAdvice2 {
	@Before(value="execution(* com.wyj.service.UserServiceImpl.*(..))")
	public void before() {
		System.out.println("前置通知");
	}
	@AfterReturning(value="execution(* com.wyj.service.UserServiceImpl.*(..))")
	public void afterReturn() {
		System.out.println("后置通知(没有发生异常情况)");
	}
	@Around(value="execution(* com.wyj.service.UserServiceImpl.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {		
		System.out.println("环绕通知之前");
		Object proceed = pjp.proceed();
		System.out.println("环绕通知之后");
		return proceed;
	}
	@AfterReturning(value="execution(* com.wyj.service.UserServiceImpl.*(..))")
	public void afterException() {
		System.out.println("异常出现之后的通知");
	}
	@After(value="execution(* com.wyj.service.UserServiceImpl.*(..))")
	public void after() {
		System.out.println("后置通知");
	}
}