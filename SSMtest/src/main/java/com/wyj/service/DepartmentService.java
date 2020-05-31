package com.wyj.service;

import java.util.List;

import com.wyj.model.Department;
import com.wyj.model.DepartmentExample;

public interface DepartmentService {

	public List<Department> getAllDepartment(DepartmentExample example);
}
