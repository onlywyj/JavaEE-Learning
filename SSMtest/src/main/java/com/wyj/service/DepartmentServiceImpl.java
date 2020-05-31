package com.wyj.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wyj.mapper.DepartmentMapper;
import com.wyj.model.Department;
import com.wyj.model.DepartmentExample;


@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

	@Resource
	private DepartmentMapper departmentMapper;
	@Override
	//查询所有部门信息
	public List<Department> getAllDepartment(DepartmentExample example) {
		
		return departmentMapper.selectByExample(example);
	}

}
