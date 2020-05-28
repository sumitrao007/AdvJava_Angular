package com.hefshine.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hefshine.bean.LoginUser;

@Repository
public class LoginUserDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean checkuser(LoginUser u) {
		boolean status=false;
		
		String query="select count(*) from login where username=? and password=?";
		
		int count=jdbcTemplate.queryForObject(query, new Object[] {u.getUsername(), u.getPassword()},Integer.class);
		if(count>0) {
			status =true;
			
		}else
		{
			status=false;
		}
		
		return status;
	}

}
