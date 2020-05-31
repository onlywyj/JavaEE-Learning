package com.wyj.simplejpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "t_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer emp_id;
    private String  emp_name;
    private String  emp_gender;
    private String  emp_password;
    private Integer emp_grade;
    private String  emp_email;
    private Integer emp_department_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_gender() {
        return emp_gender;
    }

    public void setEmp_gender(String emp_gender) {
        this.emp_gender = emp_gender;
    }

    public String getEmp_password() {
        return emp_password;
    }

    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }

    public Integer getEmp_grade() {
        return emp_grade;
    }

    public void setEmp_grade(Integer emp_grade) {
        this.emp_grade = emp_grade;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public Integer getEmp_department_id() {
        return emp_department_id;
    }

    public void setEmp_department_id(Integer emp_department_id) {
        this.emp_department_id = emp_department_id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_gender='" + emp_gender + '\'' +
                ", emp_password='" + emp_password + '\'' +
                ", emp_grade=" + emp_grade +
                ", emp_email='" + emp_email + '\'' +
                ", emp_department_id=" + emp_department_id +
                '}';
    }
}
