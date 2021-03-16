package com.wyj.model;

public class Person {
	
	private String PersonID;

	private String Name;

	private String Sex;

	private Integer birthday;

	private String IDCard;

	public String getPersonID() {
		return PersonID;
	}

	public void setPersonID(String personID) {
		PersonID = personID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public Integer getBirthday() {
		return birthday;
	}

	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}

	public String getIDCard() {
		return IDCard;
	}

	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}
	
	

}
