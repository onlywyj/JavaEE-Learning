package com.wyj.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import com.wyj.mapper.EmployeeMapper;
import com.wyj.model.Employee;
import com.wyj.service.EmployeeMapperServiceImpl;
import com.wyj.service.EmployeeService;
import com.wyj.service.EmployeeServiceImpl;
import com.wyj.util.MyBatisUtil;

public class MapperDemo {
	
	@Test
	public void getAllEmployeeByNameAndGender() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		Employee emp = new Employee();
		emp.setEmp_name("张");
		emp.setEmp_gender("男");
		List<Employee> list = employeeMapper.getAllEmployeeByNameAndGender(emp);
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			Employee employee = it.next();
			System.out.println(employee);
		}
	}
	
	@Test
	public void getAllEmployeeByNameAndGender2() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		Employee emp = new Employee();
		emp.setEmp_name("张");
		emp.setEmp_gender("男");
		List<Employee> list = employeeMapper.getAllEmployeeByNameAndGender2(emp);
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			Employee employee = it.next();
			System.out.println(employee);
		}
	}
	
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
	
	@Test
	public void updateEmployee2() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		//EmployeeService employeeService = new EmployeeMapperServiceImpl();
		Employee employee = new Employee();
		employee.setId(15);
		employee.setEmp_id(9999);
		//employee.setEmp_name("张三丰");
		//employee.setEmp_gender("男");
		//employee.setEmp_password("123456");
		//employee.setEmp_grade(13);
		//employee.setEmp_email("zhang@123.com");
		//employee.setEmp_department_id(3);
		employeeMapper.updateEmployee2(employee);
	}
	
	@Test
	public void getAllEmployeeForeach() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(4);
//		list.add(7);
//		Integer [] array = new Integer[] {1,2,5,8,13};
		Map<String,Object> map = new HashMap<String,Object>();
		Integer [] depid = new Integer[] {1};
		map.put("depid", depid);
		Integer [] id = new Integer[] {1,2,3,4,5,6,7,8};
		map.put("id", id);
		
		List<Employee> AllList = employeeMapper.getAllEmployeeForeach(map);
		Iterator<Employee> it = AllList.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp);
		}
	}

}
