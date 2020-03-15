package com.wyj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.wyj.model.User;

public class UserDaoImpl implements UserDao {

	//Spring JDBCTemplate 
	private  JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public JdbcTemplate getJt() {
		return jt;
	}
	
	/*
	private static DriverManagerDataSource ds;
	static {
		ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/userdb");
		ds.setUsername("root");
		ds.setPassword("123456");
		jt = new JdbcTemplate();
		jt.setDataSource(ds);
	}
	*/
	
	@Override
	public void insert(User user) {
		String sql = "insert into user values(?,?,?,?,?)";
		jt.update(sql, null,user.getUserName(),user.getPassword(),user.getEmail(),user.getIdentity());
	}
	@Override
	public void delete(Integer id) {
		String sql = "delete from user where id =?";
		jt.update(sql, id);
	}
	@Override
	public void update(User user) {
		String sql = "update user set username = ? where id = ?";
		jt.update(sql, user.getUserName(),user.getId());
	}
	@Override
	public User queryById(Integer id) {
		String sql = "select * from user where id = ?";
		 return jt.queryForObject(sql, new MyRowMapper(), id);		
	}

	@Override
	public List<User> queryAllUser() {
		String sql = "select * from user";
		 return jt.query(sql, new MyRowMapper());
	}
}
class MyRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int index) throws SQLException {
		User u = new User();
		u.setId(rs.getInt("id"));
		u.setUserName(rs.getString("username"));
		u.setPassword(rs.getString("password"));
		u.setEmail(rs.getString("email"));
		u.setIdentity(rs.getString("identity"));				
		return u;
	}

}
