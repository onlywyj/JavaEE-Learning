package com.wyj.simplejpa.controller;

import com.wyj.simplejpa.dao.EmployeeDao;
import com.wyj.simplejpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeDao EmployeeDao;

    @GetMapping("/test4")
    public void test4() {
        List<Employee> all = EmployeeDao.findAll();
        System.out.println(all);
    }

}