package com.wyj.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wyj.dao.StudentDao;
import com.wyj.model.Student;

@Service("studentService")
public class StudentService {
	
	@Resource(name="studentDao")
	private StudentDao studentDao;
	public Student getStudenByName(String name) {
		return studentDao.getStudentByName(name);
	}
}
