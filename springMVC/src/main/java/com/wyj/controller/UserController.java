package com.wyj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("login...");
		return "forward:/WEB-INF/jsp/login.jsp";
	}

	@RequestMapping("/checkUser")
	public ModelAndView checkUser(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+"  "+password);
		ModelAndView mav = new ModelAndView();
		mav.addObject("username",username);
		mav.addObject("password",password);
		mav.setViewName("forward:/WEB-INF/jsp/hello.jsp");
		return mav;
		
	}
}
