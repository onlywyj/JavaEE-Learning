package com.wyj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	
	@RequestMapping(value="/login",name="用户登录",method=RequestMethod.GET)
	public String login() {
		System.out.println("login...");
		return "login";
	}

	@RequestMapping("/checkUser")
	public String checkUser(HttpServletRequest request,HttpServletResponse response,Model model) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+"  "+password);
		//ModelAndView mav = new ModelAndView();
		//mav.addObject("username",username);
		//mav.addObject("password",password);
		//mav.setViewName("forward:/WEB-INF/jsp/hello.jsp");
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		//return mav;
		return "hello";
	}
	
	//单个参数
	@RequestMapping(value="/test")
	public String test(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		System.out.println(id);
		
		return "success";
	}
	
	//多个参数
	@RequestMapping(value="/test2")
	public String test2(HttpServletRequest request,Integer id,String name) {
		
		System.out.println(id+" "+name);
		
		return "success";
	}
}
