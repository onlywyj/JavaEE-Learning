package com.wyj.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.wyj.model.User;
import com.wyj.util.SQLHelper;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean checkUser(User user) {

		// SQL语句和parameters参数表
		String sql = "select * from tuserlogin where username=? and password=?";

		String[] parameters = { user.getUsername(), user.getPassword() };

		ArrayList<User> allUser = SQLHelper.executeQueryUser(sql, parameters);

		// 集合不为空，登录用户名和密码正确，返回值为真
		if (allUser.size() > 0) {
			return true;
		}
		// 返回值为假
		return false;
	}

	@Override
	public ArrayList<User> getAllUsers() {

		String sql = "select * from tuserlogin";

		String[] parameters = {};

		ArrayList<User> allUser = SQLHelper.executeQueryUser(sql, parameters);

		return allUser;
	}

	@Override
	public boolean addUser(User user) {

		boolean b = false;

		String sql = "insert into tuserlogin(username,password,grade,email) values(?,?,?,?)";

		String[] parameters = { user.getUsername(), user.getPassword(), String.valueOf(user.getGrade()),
				user.getEmail() };

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

		String[] parameters = { user.getId().toString() }; // 将整形转换为字符串类型

		try {
			SQLHelper.executeUpdate(sql, parameters);
			b = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return b;
	}

	@Override
	public boolean deleteUserBySelected(String para2) {

		boolean b = false;

		String sql = "delete from tuserlogin where id in(" + para2 + ")"; // 不知道为啥需要加（"+para2+"）双引号，先记着

		// String [] parameters= {para2};
		try {

			SQLHelper.executeUpdate(sql, null);
			// SQLHelper.executeUpdate(sql, parameters);

			b = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return b;
	}

	@Override
	public boolean modifyUser(User user) {

		boolean b = false;

		String sql = "update tuserlogin set username=? , password=? , grade=? , email=? where id=?";

		String[] parameters = { user.getUsername(), user.getPassword(), String.valueOf(user.getGrade()),
				user.getEmail(), user.getId().toString() };

		try {
			SQLHelper.executeUpdate(sql, parameters);
			b = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public User findUserById(String id) {

		String sql = "select *from tuserlogin where id=?";

		String[] parameters = { id };

		User user = SQLHelper.executeQueryUser(sql, parameters).get(0);

		return user;
	}

	@Override
	public ArrayList<User> findUserByName(String username) {

		ArrayList<User> allUsers = new ArrayList<User>();

		String sql = "select *from tuserlogin where username=?";

		String[] parameters = { username };

		allUsers = SQLHelper.executeQueryUser(sql, parameters);

		return allUsers;
	}

	@Override
	public ArrayList<User> getAllUsersByPage(int currentPage, int pageSize) {

		ArrayList<User> arrayUsersByPage = new ArrayList<User>();

		String sql = "select * from tuserlogin limit " + (currentPage - 1) * pageSize + "," + pageSize;

		String[] parameters = null;

		arrayUsersByPage = SQLHelper.executeQueryUser(sql, parameters);

		return arrayUsersByPage;

	}

	@Override
	public Integer getUserCount() {

		int count = 0;

		String sql = "select count(*) from tuserlogin";

		String[] parameters = null;

		ResultSet rs = SQLHelper.executeQuery(sql, parameters);

		try {
			if (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SQLHelper.close(SQLHelper.getRs(), SQLHelper.getPs(), SQLHelper.getCt());
		}

		return count;

	}

}
