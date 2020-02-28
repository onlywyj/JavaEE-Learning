package com.wyj.model;

import java.util.List;

public class Clazz {

	private Integer clazzNo; //编号
	private String clazzname; //名称
	private String instructor; //辅导员
	private Integer countNum; //人数
	private List<Student> list;
	
	public Integer getClazzNo() {
		return clazzNo;
	}
	public void setClazzNo(Integer clazzNo) {
		this.clazzNo = clazzNo;
	}
	public String getClazzname() {
		return clazzname;
	}
	public void setClazzname(String clazzname) {
		this.clazzname = clazzname;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public Integer getCountNum() {
		return countNum;
	}
	public void setCountNum(Integer countNum) {
		this.countNum = countNum;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	
}
