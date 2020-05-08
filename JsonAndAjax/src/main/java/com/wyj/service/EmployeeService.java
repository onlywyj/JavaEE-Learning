package com.wyj.service;

import java.util.List;

import com.wyj.model.Employee;
import com.wyj.model.EmployeeExample;


public interface EmployeeService {

	public List<Employee> getAllEmployee(EmployeeExample example);
}
