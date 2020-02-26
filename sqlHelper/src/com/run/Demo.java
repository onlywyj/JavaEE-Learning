package com.run;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

import com.model.Employee;
import com.util.SQLHelper;

public class Demo {

	@Test
	public void run() {
		
		String sql = "select * from employee";
		String [] parameters = {};
		ArrayList<Employee> allemp = SQLHelper.executeQueryEmployees(sql, parameters);
		Iterator<Employee> it = allemp.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.getId()+" "+e.getEmp_id()+" "+e.getEmp_name()+" "+
								e.getEmp_gender()+" "+e.getEmp_password()+" "+e.getEmmp_grade()+" "+
								e.getEmp_email()+" "+e.getEmp_department_id());
		}   
	}
}
