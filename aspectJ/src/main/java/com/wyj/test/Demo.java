package com.wyj.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wyj.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class Demo {
	
	@Resource
	private UserService us;

	@Test
	public void run() {
		
		us.delete();
		us.insert();
	}
	
	@Test
	public void run2() {
		
		us.delete();
		us.insert();
	}	
}