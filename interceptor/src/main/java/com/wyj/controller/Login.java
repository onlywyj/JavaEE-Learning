package com.wyj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Login {

	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String tologin() {
		System.out.println("login ... ");
		return "login";
	}	
	@RequestMapping(value="/checkUser",method = RequestMethod.POST)
	public String checkUser(HttpServletRequest request,HttpSession session,Model model) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("admin")&&password.equals("admin")) {
			session.setAttribute("username",username);
			return "main";
		}
		model.addAttribute("msg", "错误的用户名或密码");
		return "login";
	}
	@RequestMapping(value="/main")
	public String toMain() {
		
		return "main";
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
}
