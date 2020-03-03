package com.wyj.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wyj.model.Student;
import com.wyj.service.StudentService;

public class Demo {

	@Test
	public void run() {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student) ac.getBean("student2");
		System.out.println(s.getName());
		System.out.println(s.getComputer().getLogo()+" "+s.getComputer().getPrice());
	}
	
	@Test
	public void run2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService ss = (StudentService) ac.getBean("studentService");
		Student student = ss.getStudenByName("Mary");
		System.out.println(student.getName()+" "+student.getComputer().getLogo()+" "+student.getComputer().getPrice());
		
	}
}

