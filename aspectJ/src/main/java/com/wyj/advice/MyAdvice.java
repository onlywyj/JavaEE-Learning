package com.wyj.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;
@Component("myAdvices")
public class MyAdvice {
	
	public void before() {
		System.out.println("前置通知");
	}
	public void afterReturn() {
		System.out.println("后置通知(没有发生异常情况)");
	}
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知之前");
		Object proceed = pjp.proceed();
		System.out.println("环绕通知之后");
		return proceed;
	}
	public void afterException() {
		System.out.println("异常出现之后的通知");
	}
	public void after() {
		System.out.println("后置通知");
	}

}
