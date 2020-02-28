package com.wyj.dao;

import java.util.ArrayList;

import com.wyj.model.Clazz;
import com.wyj.model.Student;

public interface ClazzDao {
	
	//根据班级的编号获取班级的信息
	public String getClazzById (Integer clazzId);
	//根据班级的名称获取全体学生的信息
	public ArrayList<Student> getAllStudentByClazzName(String clazzname);
	//录入新的班级信息
	public void insertClazz(Clazz clazz);

}
