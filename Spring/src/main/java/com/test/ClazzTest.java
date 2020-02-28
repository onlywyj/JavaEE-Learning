package com.test;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wyj.model.Student;
import com.wyj.service.ClazzService;

public class ClazzTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ClazzService clazzService = (ClazzService) ac.getBean("clazzService");
	
		String clazzInformation = clazzService.getClazzById(1001);
		
		System.out.println(clazzInformation);
		
		ArrayList<Student> list = clazzService.getAllStudentByClazzName("软件工程");
		
		Iterator<Student> it =list.iterator();
		
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println(s.getName()+" "+s.getGender());
		}
		
	}

	
}
