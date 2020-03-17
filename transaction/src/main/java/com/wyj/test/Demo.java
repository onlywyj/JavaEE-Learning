package com.wyj.test;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;

import com.wyj.service.UserService;

public class Demo {
	
	@Resource(name="userService")
	private UserService us;
	@Test
	public void run() {

		us.transfer(1, 2, 500.0);
	}

}
