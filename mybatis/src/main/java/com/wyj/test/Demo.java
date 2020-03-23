package com.wyj.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.wyj.model.Employee;

public class Demo {
	
	@Test
	public void run2() {
		try {
			InputStream is = Resources.getResourceAsStream("sqlMapperConfig.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
			SqlSession sqlSession = ssf.openSession(true);//自动提交
			sqlSession.delete("com.wyj.model.deleteEmployeeById",654321);
			//sqlSession.commit();//自动提交
			sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void run() {
		// 创建文件输入流
		// 创建会话工厂
		// 创建会话
		// 利用会话操作数据库
		// 关闭会话
		try {
			InputStream is = Resources.getResourceAsStream("sqlMapperConfig.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
			SqlSession sqlSession = ssf.openSession();
			//Employee emp = sqlSession.selectOne("com.wyj.model.findEmployeeById", 1005);
			//System.out.println(emp);
			List<Employee> all = sqlSession.selectList("com.wyj.model.getAllEmployee");
			Iterator<Employee> it = all.iterator();
			while(it.hasNext()) {
				Employee emp = it.next();
				System.out.println(emp.getEmp_id()+" "+emp.getEmp_name()+" "+emp.getEmp_department_id());
			}
			sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
