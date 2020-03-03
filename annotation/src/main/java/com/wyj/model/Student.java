package com.wyj.model;

public class Student {
	
	private String name;
	private Computer computer;
	
	public Student() {
		
	}
	
	public Student (String name,Computer computer) {
		super();
		this.name = name;
		this.computer = computer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
}
