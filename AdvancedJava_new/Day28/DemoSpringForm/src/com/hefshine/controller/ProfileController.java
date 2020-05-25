package com.hefshine.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hefshine.bean.Student;
import com.hefshine.dao.StudentDAO;

@Controller
public class ProfileController {
	
	@Autowired
	StudentDAO dao;
	
	@RequestMapping("/profile")
	public String ProfilePage(Map<String, Object> model) {
		
		List<Student> list=	dao.getAllRecords();
		
		model.put("studentlist", list);
		
		return "welcome";
	}

}
