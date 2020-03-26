package com.wyj.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wyj.model.Employee;
import com.wyj.util.MyBatisUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployee() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		List<Employee> list = sqlSession.selectList("com.wyj.model.getAllEmployee");
		return list;
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		Employee employee = sqlSession.selectOne("com.wyj.model.findEmployeeById", 1001);
		sqlSession.close();
		return employee;
	}

	@Override
	public List<Employee> getAllEmployeeByName(String name) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		List<Employee> list = sqlSession.selectList("com.wyj.model.getAllEmployeeByName");
		return list;
	}

	@Override
	public List<Employee> getAllEmployeeByName2(String name) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		List<Employee> list = sqlSession.selectList("com.wyj.model.getAllEmployeeByName2");
		return list;
	}

	@Override
	public void insertEmployee(Employee employee) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		sqlSession.insert("com.wyj.model.insertEmployee",employee);

	}

	@Override
	public void deleteEmployee(Integer id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		sqlSession.delete("com.wyj.model.deleteEmployee",id);

	}

	@Override
	public void updateEmployee(Employee employee) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		sqlSession.update("com.wyj.model.updateEmployee",employee);

	}

}
