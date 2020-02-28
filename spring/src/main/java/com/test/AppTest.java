package com.test;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wyj.model.Student;
import com.wyj.service.ClazzService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AppTest {
	
	@Resource
	private ApplicationContext ac;
	
	@Test
	public void run() { 
		ClazzService clazzService = (ClazzService) ac.getBean("clazzService");
		
		String clazzInformation = clazzService.getClazzById(1001);
		
		System.out.println(clazzInformation);
		
		ArrayList<Student> list = clazzService.getAllStudentByClazzName("网络工程软件");
		
		Iterator<Student> it =list.iterator();
		
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println(s.getName()+" "+s.getGender());
		}
	}

}
