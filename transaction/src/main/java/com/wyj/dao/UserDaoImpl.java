package com.wyj.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void deposit(Integer id, Double money) {
		
		jt.update("update t_account set money = money + ? where id = ?", money,id);

	}

	@Override
	public void withdraw(Integer id, Double money) {
		
		jt.update("update t_account set money = money - ? where id = ?", money,id);

	}

}
