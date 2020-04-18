package com.wyj.service;

import java.util.ArrayList;

import com.wyj.domain.Users;
import com.wyj.util.SQLHelper;

public class UserService {

	public boolean checkUsers(Users users) {
		String sql = "select * from users where username=?  and password=?";
		String[] parameters = { users.getUsername(), users.getPassword() };
		ArrayList al = new SQLHelper().executeQuery2(sql, parameters);
		if (al.size() == 0) {
			return false;
		} else {
			Object[] obj = (Object[]) al.get(0); // 把对象数组装入users对象
			users.setUsername((String) obj[1]);
			users.setEmail((String) obj[3]);
			users.setGrade(Integer.parseInt(obj[5].toString()));
			return true;
		}
	}
}
