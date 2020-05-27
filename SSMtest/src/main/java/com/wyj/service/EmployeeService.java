package com.wyj.service;

import java.util.List;

import com.wyj.model.Employee;
import com.wyj.model.EmployeeExample;


public interface EmployeeService {

	public List<Employee> getAllEmployee(EmployeeExample example);

	public Employee checkUser(String username, String password);

	public List<Employee> getAllEmployeeByPage(int beginIndex, int pageSize);

	public int getTotalCount();
	
}
