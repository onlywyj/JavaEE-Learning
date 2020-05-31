package com.wyj.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wyj.model.Employee;
import com.wyj.model.EmployeeExample;
import com.wyj.model.PageBean;
import com.wyj.service.EmployeeService;

@Controller
public class EmployeeController {
	String username;
	@Resource
	private EmployeeService employeeService;
	@Resource
	private EmployeeExample example;

	@RequestMapping("/login")  
	public String checkUser(HttpServletRequest request, Model model) {   
		username = request.getParameter("username");   
		String password = request.getParameter("password");   
		System.out.println(username+" "+password);   
		Employee emp = employeeService.checkUser(username, password);   
		if(emp!=null) {    
			return "forward:/getAllEmployee?currentPage=1";      
			}else {    
				model.addAttribute("errorMessage", "错误的用户名或密码");    
				return"forward:/index.jsp";   
				}   
		} 
	
	@RequestMapping("to")
	public String to(){
		return "forward:/getAllEmployee";
	}
	
	@RequestMapping("/getAllEmployee")
	public ModelAndView getSubEmployeeByPage(@RequestParam int currentPage,HttpSession session) {
		ModelAndView mav = new ModelAndView();
		int pageSize = 10;		
		session.setAttribute("currentPage",currentPage);
		int beginIndex = (currentPage-1)*pageSize;
		System.out.println("currentPage="+currentPage);
		int recordCount = employeeService.getTotalCount();
		
		List<Employee> allEmployee = employeeService.getAllEmployeeByPage(beginIndex, pageSize);
		PageBean pb = new PageBean(beginIndex,pageSize,recordCount,allEmployee);
		mav.addObject("employee", pb);
		mav.addObject("username",username);
		mav.setViewName("showEmployee");
		return mav;
	}
	
}
