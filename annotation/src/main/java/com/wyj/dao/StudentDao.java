package com.wyj.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.wyj.model.Student;

@Repository(value="studentDao")
public class StudentDao {
	
	@Resource(name="student")
	private Student s;
	public Student getStudentByName(String name) {
		if(s.getName().equals(name)) {
			return s;
		}
		return null;
	}
}
