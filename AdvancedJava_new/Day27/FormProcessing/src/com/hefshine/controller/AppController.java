package com.hefshine.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hefshine.bean.User;
import com.hefshine.dao.UserDAO;

@Controller
public class AppController {
	
	@Autowired
	UserDAO useDAO;
	@Autowired
	User user;
	
	@RequestMapping("/")
	public String HomePage() {
		//return "login";
		return "home";
	}
	
//	@RequestMapping(value = "/login",method = RequestMethod.POST)
//	public String loginPage(HttpServletRequest req) {
//		
//		System.out.println("Login Page...... "+req.getParameter("username"));
//		
//		return "user";
//	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}	
	
	
//	@RequestMapping(value = "/login",method = RequestMethod.POST)
	@PostMapping("/login")
	public ModelAndView loginPage(@RequestParam("username") String username1,@RequestParam("password") String pwd) {
//	public String loginPage(@RequestParam("username") String username1,@RequestParam("password") String pwd) {
		
		System.out.println("Login Page...... "+username1);
		
		user.setUsername(username1);
		user.setPassword(pwd);
		
		boolean status=useDAO.checkuser(user);//we get dao object with the help of Autowiring
		ModelAndView mv=new ModelAndView();
		
		if(status) {
			System.out.println("success");
			mv.setViewName("user");
			mv.addObject("username1", username1);
			
			//return "user";
			return mv;
		}else
		{
			System.out.println("Invalid");
			
			mv.setViewName("message");
			mv.addObject("username1", username1);
			
			return mv;
		}
		
		
	}

}
