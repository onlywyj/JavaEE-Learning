package com.wyj.mapper;

import java.util.List;

import com.wyj.model.Employee;

public interface EmployeeMapper {

		//查询全体员工
		public List<Employee> getAllEmployee();
		//根据员工编号查询
		public Employee findEmployeeById(Integer id);
		//根据员工姓名查询方式1 模糊查询
		public List<Employee> getAllEmployeeByName(String name);
		//根据员工姓名查询方式2 模糊查询
		public List<Employee> getAllEmployeeByName2(String name);
		//插入新员工信息
		public void insertEmployee(Employee employee);
		//根据员工编号删除信息
		public void deleteEmployee(Integer id);
		//更新员工信息
		public void updateEmployee(Employee employee);
}
