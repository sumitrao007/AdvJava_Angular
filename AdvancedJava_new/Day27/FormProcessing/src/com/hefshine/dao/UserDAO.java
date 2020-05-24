package com.hefshine.dao;

import org.springframework.stereotype.Repository;

import com.hefshine.bean.User;

@Repository
public class UserDAO {
	
	public boolean checkuser(User u) {
		boolean status=false;
		
		if(u.getUsername().equalsIgnoreCase("admin") && u.getPassword().equalsIgnoreCase("admin")) {
			
			status=true;
			
		}else {
			status=false;
			
		}
		
		return status;
	}

}
