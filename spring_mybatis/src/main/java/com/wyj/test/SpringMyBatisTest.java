package com.wyj.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wyj.dao.EmployeeDao;
import com.wyj.mapper.EmployeeMapper;
import com.wyj.model.Employee;
import com.wyj.service.EmployeeService;
import com.wyj.service.EmployeeServiceImpl;

public class SpringMyBatisTest {
	
	@Test
	public void findEmployee() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao) ac.getBean("employeeDao");
		System.out.println(employeeDao.findEmployeeById(1001));
	}
	 
	@Test
	public void insertEmployee() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao) ac.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setEmp_id(8888);
		employee.setEmp_name("张三丰");
		employee.setEmp_gender("男");
		employee.setEmp_password("123456");
		employee.setEmp_grade(13);
		employee.setEmp_email("zhang@123.com");
		employee.setEmp_department_id(3);
		employeeDao.insertEmployee(employee);
	}
 
	@Test
	public void mapper_findEmployee() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		EmployeeMapper mapper = (EmployeeMapper) ac.getBean("employeeMapper");
		System.out.println(mapper.findEmployeeById(1002));
	}
	
	@Test
	public void mapper_insertEmployee() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		EmployeeMapper mapper = (EmployeeMapper) ac.getBean("employeeMapper");
		Employee employee = new Employee();
		employee.setEmp_id(8888);
		employee.setEmp_name("张无忌");
		employee.setEmp_gender("男");
		employee.setEmp_password("123456");
		employee.setEmp_grade(13);
		employee.setEmp_email("zhang@123.com");
		employee.setEmp_department_id(3);
		mapper.insertEmployee(employee);
	}
}
