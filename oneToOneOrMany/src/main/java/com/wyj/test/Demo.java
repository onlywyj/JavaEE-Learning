package com.wyj.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.wyj.mapper.EmployeeMapper;
import com.wyj.model.Employee;
import com.wyj.util.MyBatisUtil;

public class Demo {
	
	@Test
	public void findEmployeeWithDepartment(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		Employee emp = employeeMapper.findEmployeeWithDepartment(1002);
		System.out.println(emp);
		
		
	}
	

}
