package com.wyj.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wyj.model.Employee;
import com.wyj.model.EmployeeExample;
import com.wyj.service.EmployeeService;


@Controller
public class EmployeeController {
	@Resource
	private EmployeeService employeeService;
	@Resource
	private EmployeeExample example;
	@RequestMapping("getAllEmployee")
	
	public @ResponseBody List<Employee> getAllEmployee(){		
		
		System.out.println("ajax访问一次");
		return employeeService.getAllEmployee(example);
		
	}
	
}
