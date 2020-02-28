package com.wyj.service;

import java.util.ArrayList;

import com.wyj.dao.ClazzDao;
import com.wyj.model.Clazz;
import com.wyj.model.Student;

public class ClazzServiceImpl implements ClazzService {

	private ClazzDao clazzDao;
	
	public void setClazzDao(ClazzDao clazzDao) {
		this.clazzDao = clazzDao;
	}

	@Override
	public String getClazzById(Integer clazzId) {
		
		return clazzDao.getClazzById(clazzId);

	}

	@Override
	public ArrayList<Student> getAllStudentByClazzName(String clazzname) {
		
		return clazzDao.getAllStudentByClazzName(clazzname);
	}

	@Override
	public void insertClazz(Clazz clazz) {
		

	}

}
