package com.wyj.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wyj.model.Employee;
import com.wyj.model.EmployeeExample;
import com.wyj.service.EmployeeService;


@RunWith(SpringJUnit4ClassRunner.class)
//指定Spring的配置文件路径
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Demo {
	
	@Resource
	private EmployeeService employeeService;
	@Resource
	private EmployeeExample example;
	@Test
	public void run() {
		
		List<Employee> allEmployee = employeeService.getAllEmployee(example);
		for(Employee emp: allEmployee) {
			System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpGender());
		}
				
	}

}
