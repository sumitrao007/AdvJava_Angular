package com.hefshine.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/delete/{rollnumber}")
	public String DeleteRecord(@PathVariable int rollnumber,Map<String, Object> model) {
		
		int status=dao.deleteParticularRecord(rollnumber);
		if(status>0) {
			List<Student> list=	dao.getAllRecords();
			
			model.put("studentlist", list);
			return "welcome";
			
		}else
		{
			return "welcome";
		}
		
		
	}

}
