package com.wyj.test;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.wyj.model.Employee;
import com.wyj.service.EmployeeService;
import com.wyj.service.EmployeeServiceImpl;

public class Demo {
	
	//查询全体员工

	//根据员工编号查询

	//根据员工姓名查询方式1 模糊查询

	//根据员工姓名查询方式2 模糊查询

	//插入新员工信息
	@Test
	public void insertEmployee() {
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = new Employee();
		employee.setEmp_id(9999);
		employee.setEmp_name("张三丰");
		employee.setEmp_gender("男");
		employee.setEmp_password("123456");
		employee.setEmp_grade(13);
		employee.setEmp_email("zhang@123.com");
		employee.setEmp_department_id(3);
		employeeService.insertEmployee(employee);
	}

	//根据员工编号删除信息

	//更新员工信息


}
