package com.wyj.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbTest {
	
	static Connection ct;
	static PreparedStatement ps;
	static ResultSet rs;

	public static void main(String[] args) throws SQLException {
		myInsert();
		mySelect();
		
	}

	
	private static void myInsert() throws SQLException {
		//写出类的全限定名称 包+类名
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//加载数据库的驱动
			ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_erp", "root", "12344321");
			//获得数据库连接
			ps = ct.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setInt(2, 654321);
			ps.setString(3, "TestUser");
			ps.setString(4, "男");
			ps.setString(5, "123");
			ps.setString(6, "4");
			ps.setString(7, "Test@126.com");
			ps.setInt(8, 2);
			
			ps.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			//释放资源
			if(rs!=null) {
				rs.close();
			}
			if(ps!=null) {
				ps.close();
			}
			if(ct!=null) {
				ct.close();
			}
		}
	}
		
		
	private static void mySelect() throws SQLException {
		//写出类的全限定名称 包+类名
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//加载驱动
			ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_erp", "root", "12344321");
			//获得连接
			ps = ct.prepareStatement("select *from employee");
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("emp_id")+"|"+
								   rs.getString("emp_name")+"|"+
								   rs.getString("emp_email"));
			}
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			//释放资源
			if(rs!=null) {
				rs.close();
			}
			if(ps!=null) {
				ps.close();
			}
			if(ct!=null) {
				ct.close();
			}
		}
		

		
		
	}
	
}
