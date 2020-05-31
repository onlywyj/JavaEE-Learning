package com.wyj.simplejpa.dao;

import com.wyj.simplejpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {

}
