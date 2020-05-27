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
		
		return employeeMapper.getAllEmployee(example);
		
	}
	@Override
	public Employee checkUser(String username, String password) {
		// TODO 自动生成的方法存根
		return employeeMapper.checkUser(username, password);
	}
	@Override
	public List<Employee> getAllEmployeeByPage(int beginIndex, int pageSize) {
		// TODO 自动生成的方法存根
		return employeeMapper.getAllEmployeeByPage(beginIndex, pageSize);
	}
	@Override
	public int getTotalCount() {
		// TODO 自动生成的方法存根
		return employeeMapper.getTotalCount();
	}

}
