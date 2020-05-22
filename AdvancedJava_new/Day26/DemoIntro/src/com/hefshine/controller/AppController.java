package com.hefshine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class AppController {
	
	@RequestMapping("/")
	public String homepage() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginpage() {
		return "login";
	}
	
	//use for wild character 
	@RequestMapping("/**")
	public String messagepage() {
		return "message";
	}
	
	@RequestMapping("/user")
	public String Userpage() {
		return "user";
	}
	

}
