package com.wyj.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wyj.mapper.EmployeeMapper;
import com.wyj.model.Employee;
import com.wyj.model.EmployeeExample;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Resource
	private EmployeeMapper employeeMapper;
	@Resource
	private EmployeeExample example;
	@Override
	public List<Employee> getAllEmployee(EmployeeExample example) {
		
		return employeeMapper.selectByExample(example);
		
	}

}
