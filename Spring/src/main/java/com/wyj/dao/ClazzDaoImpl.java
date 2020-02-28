package com.wyj.dao;

import java.util.ArrayList;
import java.util.List;

import com.wyj.model.Clazz;
import com.wyj.model.Student;

public class ClazzDaoImpl implements ClazzDao {

	private Clazz clazz1,clazz2;
	private List<Student> list1,list2;
	
	//模拟数据库的操作，用集合代替
	public void createDB() {
		clazz1 = new Clazz();
		clazz1.setClazzNo(1001);
		clazz1.setClazzname("网络工程软件");
		clazz1.setInstructor("张老师");
		clazz1.setCountNum(43);
		Student s1 = new Student("网络工程学生1","男");
		Student s2 = new Student("网络工程学生2","女");
		list1 = new ArrayList<Student>();
		list1.add(s1);
		list1.add(s2);
		clazz1.setList(list1);
		//////////////////////////////////////////////
		clazz2 = new Clazz();
		clazz2.setClazzNo(1002);
		clazz2.setClazzname("网络工程应用");
		clazz2.setInstructor("张老师");
		clazz2.setCountNum(43);
		Student s3 = new Student("网络工程学生1","男");
		Student s4 = new Student("网络工程学生2","女");
		list2 = new ArrayList<Student>();
		list2.add(s3);
		list2.add(s4);
		clazz2.setList(list2);
	}
	
	public String getClazzById(Integer clazzId) {
		//模拟从数据库中取得数据
		createDB();
		String clazzInfo = null;
		if(clazzId.equals(clazz1.getClazzNo())) {
			clazzInfo = clazz1.getClazzNo()+"|"+clazz1.getClazzname()+"|"+clazz1.getInstructor()+"|"+
						clazz1.getCountNum();
		}else if(clazzId.equals(clazz2.getClazzNo())) {
			clazzInfo = clazz2.getClazzNo()+"|"+clazz2.getClazzname()+"|"+clazz2.getInstructor()+"|"+
						clazz2.getCountNum();
		}

		return clazzInfo;
	}

	public ArrayList<Student> getAllStudentByClazzName(String clazzname) {
		
		createDB();
		if(clazzname.equals(clazz1.getClazzname())) {
			return (ArrayList<Student>) clazz1.getList();
		}else if(clazzname.equals(clazz1.getClazzname())) {
			return (ArrayList<Student>) clazz1.getList();
		}

		return null;
	}

	public void insertClazz(Clazz clazz) {

	}

}
