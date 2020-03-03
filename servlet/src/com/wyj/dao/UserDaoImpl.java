package com.wyj.dao;

import java.util.ArrayList;

import com.wyj.model.User;
import com.wyj.util.SQLHelper;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean checkUser(User user) {
		
		//SQL语句和parameters参数表
		String sql = "select * from tuserlogin where username=? and password=?";
		String [] parameters= {user.getUsername(),user.getPassword()};
		ArrayList<User> allUser = SQLHelper.executeQueryUser(sql, parameters);
		//集合不为空，登录用户名和密码正确，返回值为真
		if(allUser.size()>0) {
			return true;
		}
		//返回值为假
		return false;
	}

	@Override
	public ArrayList<User> getAllUser() {
		
		String sql = "select * from tuserlogin";
		String [] parameters= {};
		ArrayList<User> allUser = SQLHelper.executeQueryUser(sql, parameters);
		
		return allUser;
	}

	@Override
	public boolean addUser(User user) {
		boolean b = false;
        String sql = "insert into tuserlogin(username,password,grade,email) values(?,?,?,?)";
        String []parameters = {user.getUsername(),user.getPassword(),String.valueOf(user.getGrade()),user.getEmail()};
        try {
            SQLHelper.executeUpdate(sql, parameters);
            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b; 
	}
	
	@Override
	public boolean deleteUser(User user) {
		boolean b = false;
		String sql = "delete from tuserlogin where id=?";
		String [] parameters= {user.getId().toString()}; //将整形转换为字符串类型
		try {
			SQLHelper.executeUpdate(sql, parameters);
			b = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return b;
	}
	
}
