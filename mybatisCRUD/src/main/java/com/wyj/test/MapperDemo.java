package com.wyj.test;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.wyj.model.Employee;
import com.wyj.service.EmployeeMapperServiceImpl;
import com.wyj.service.EmployeeService;
import com.wyj.service.EmployeeServiceImpl;

public class MapperDemo {
	
	//查询全体员工
	@Test
	public void getAllEmployee() {
		EmployeeService employeeService = new EmployeeMapperServiceImpl();
		List<Employee> list = employeeService.getAllEmployee();
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp);
		}
	}

	//根据员工编号查询
	@Test
	public void findEmployeeById() {
		EmployeeService employeeService = new EmployeeMapperServiceImpl();
		System.out.println(employeeService.findEmployeeById(1001));
	}

	//根据员工姓名查询方式1 模糊查询
	@Test
	public void findEmployeeByName() {
		EmployeeService employeeService = new EmployeeMapperServiceImpl();
		List<Employee> list = employeeService.getAllEmployeeByName("张");
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp);
		}
	}
	 
	//根据员工姓名查询方式2 模糊查询
	@Test
	public void findEmployeeByName2() {
		EmployeeService employeeService = new EmployeeMapperServiceImpl();
		List<Employee> list = employeeService.getAllEmployeeByName2("%赵%");
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp);
		}
	}

	//插入新员工信息
	@Test
	public void insertEmployee() {
		EmployeeService employeeService = new EmployeeMapperServiceImpl();
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
	@Test
	public void deleteEmployeeById() {
		EmployeeService employeeService = new EmployeeMapperServiceImpl();
		employeeService.deleteEmployee(9999);
	}
	

	//更新员工信息
	@Test
	public void updateEmployee() {
		EmployeeService employeeService = new EmployeeMapperServiceImpl();
		Employee employee = new Employee();
		employee.setId(15);
		employee.setEmp_id(1015);
		employee.setEmp_name("张三丰");
		employee.setEmp_gender("男");
		employee.setEmp_password("123456");
		employee.setEmp_grade(13);
		employee.setEmp_email("zhang@123.com");
		employee.setEmp_department_id(3);
		employeeService.updateEmployee(employee);
	}

}
