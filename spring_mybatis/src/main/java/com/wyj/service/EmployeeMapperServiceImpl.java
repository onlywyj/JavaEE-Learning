package com.wyj.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wyj.mapper.EmployeeMapper;
import com.wyj.model.Employee;
import com.wyj.util.MyBatisUtil;

public class EmployeeMapperServiceImpl implements EmployeeService {

	@Override
	public List<Employee> getAllEmployee() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		List<Employee> list = employeeMapper.getAllEmployee();
		sqlSession.close();
		return list;
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		Employee employee = employeeMapper.findEmployeeById(id);
		sqlSession.close();
		return employee;
	}

	@Override
	public List<Employee> getAllEmployeeByName(String name) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		List<Employee> list = employeeMapper.getAllEmployeeByName(name);
		sqlSession.close();
		return list;
	}

	@Override
	public List<Employee> getAllEmployeeByName2(String name) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		List<Employee> list = employeeMapper.getAllEmployeeByName2(name);
		sqlSession.close();
		return list;
	}

	@Override
	public void insertEmployee(Employee employee) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		employeeMapper.insertEmployee(employee);
		sqlSession.close();

	}

	@Override
	public void deleteEmployee(Integer id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		employeeMapper.deleteEmployee(id);
		sqlSession.close();

	}

	@Override
	public void updateEmployee(Employee employee) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		employeeMapper.updateEmployee(employee);
		sqlSession.close();

	}

}
