package com.wyj.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
		String username = request.getParameter("username");   
		String password = request.getParameter("password");   
		System.out.println(username+" "+password);   
		Employee emp = employeeService.checkUser(username, password);   
		if(emp!=null) {    
			return "forward:/getAllEmployee";      
			}else {    
				model.addAttribute("errorMessage", "错误的用户名或密码");    
				return"forward:/index.jsp";   
				}   
		} 
	
	@RequestMapping("to")
	public String to(){
		return "forward:/getAllEmployee";
	}
	
	// 分页
	@RequestMapping(value="/getAllEmployee") 
	public ModelAndView getSubEmployeeByPage() {
		ModelAndView mav = new ModelAndView();
		int currentPage = 1;
		int pageSize = 50; 
		int beginIndex = (currentPage-1)*pageSize;
		int recordCount = employeeService.getTotalCount();
		System.out.println(recordCount); 
		List<Employee> allEmployee = employeeService.getAllEmployeeByPage(beginIndex, pageSize); 
		//System.out.println(allEmployee);
		PageBean pb = new PageBean(currentPage,pageSize,recordCount,allEmployee);
		//System.out.println(pb);
		mav.addObject("employee", pb); 
		mav.addObject("username",username);
		mav.setViewName("showEmployee"); 
		return mav; 
		} 
	
}
