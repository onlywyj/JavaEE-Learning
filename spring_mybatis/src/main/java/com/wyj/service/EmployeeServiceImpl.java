package com.wyj.service;

import java.util.List;

import com.wyj.dao.EmployeeDao;
import com.wyj.dao.EmployeeDaoImpl;
import com.wyj.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao = new EmployeeDaoImpl();
	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeDao.getAllEmployee();
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		
		return employeeDao.findEmployeeById(id);
	}

	@Override
	public List<Employee> getAllEmployeeByName(String name) {
		
		return employeeDao.getAllEmployeeByName(name);
	}

	@Override
	public List<Employee> getAllEmployeeByName2(String name) {
		
		return employeeDao.getAllEmployeeByName2(name);
	}

	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
		
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeDao.deleteEmployee(id);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
		
	}



}
