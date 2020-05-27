package com.wyj.mapper;

import com.wyj.model.Employee;
import com.wyj.model.EmployeeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

	// 逆向工程之后，手动增加，校验用户登录方法 
    Employee checkUser(String username,String password);
	//逆向工程之后，手动增加，获取全体员工信息方法 
    List<Employee> getAllEmployee(EmployeeExample example); 
    //逆向工程之后，手动增加，获取数据库总行数方法 
    int getTotalCount(); 
    //逆向工程之后，手动增加，分页方法
	List<Employee> getAllEmployeeByPage(int currentPage, int pageSize); 
	//以上为手动添加的五个方法

	List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}