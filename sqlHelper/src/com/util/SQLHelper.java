package com.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.model.Employee;

public class SQLHelper {
	
	static Connection ct = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	static String url ="";
	static String user = "";
	static String password = "";
	static String driver = "";
	static Properties pro = null;
	static InputStream file = null;

	static{
		try {
			pro = new Properties();
			file = SQLHelper.class.getClassLoader().getResourceAsStream("db.properties");
			pro.load(file); 
			url = pro.getProperty("url");
			user = pro.getProperty("user");
			password = pro.getProperty("password");
			driver = pro.getProperty("driver");
			Class.forName(driver); 
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
				}finally {
				try {
					file.close();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
					e.printStackTrace();
				}finally {
					file = null;
			}	
		}
	}

	public static Connection getCt() {	
		return ct;
	}
	
	public static PreparedStatement getPs() {
		return ps;
	}

	public static ResultSet getRs() {
		return rs;
	}

	public static Connection getConnection() {
		
		try {
			ct = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return ct;
	}
	
	public static void executeUpdate(String sql,String[]parameters) {
		
		try {
			ct = getConnection();
			ps = ct.prepareStatement(sql);
			if(parameters!=null) {
				for(int i = 0;i<parameters.length;i++) {
					ps.setString(i+1,parameters[i]);
				}
			} 
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();	
		}finally {
			close(rs,ps,ct);
		}
	}
	
	public static ResultSet executeQuery(String sql,String[]parameters) {
		
		try {
			ct = getConnection();
			ps = ct.prepareStatement(sql);
			if(parameters!=null) {
				for(int i = 0;i<parameters.length;i++) {
					ps.setString(i+1,parameters[i]);
				}
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();	
		}
		return rs;
	}
	
	//函数的二次封装，避免调用者手动关闭结果集合，根据业务逻辑的需要，model
	public static ArrayList<Employee> executeQueryEmployees(String sql,String[]parameters){
		ArrayList<Employee> allemployee = new ArrayList<Employee>();
		try {
			ct = getConnection();
			ps = ct.prepareStatement(sql);
			if(parameters!=null) {
				for(int i = 0;i<parameters.length;i++) {
					ps.setString(i+1, parameters[i]);
				}
			}
			rs = ps.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setEmp_id(rs.getInt(2));
				emp.setEmp_name(rs.getString(3));
				emp.setEmp_gender(rs.getString(4));
				emp.setEmp_password(rs.getInt(5));
				emp.setEmmp_grade(rs.getInt(6));
				emp.setEmp_email(rs.getString(7));
				emp.setEmp_department_id(rs.getInt(8));
				allemployee.add(emp);
			}
				 
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();	
		}finally {
			close(rs,ps,ct);
		}
		return allemployee;
	}
	
	public static void close(ResultSet rs,Statement ps,Connection ct) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if(ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if(ct!=null) {
		try {
			ct.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
		
	}

	
	
}

