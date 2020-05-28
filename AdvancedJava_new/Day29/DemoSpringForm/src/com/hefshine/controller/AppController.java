package com.hefshine.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hefshine.bean.LoginUser;
import com.hefshine.dao.LoginUserDAO;

@Controller
public class AppController {
	
	@Autowired
	LoginUser user;
	
	@Autowired
	LoginUserDAO dao;
	
	@RequestMapping("/")
	public String HomePage() {
		return "home";
	}
	
	@GetMapping("/login")
	public String loginPage(Model m) {
		
		//It is mandatory
		m.addAttribute("user", user);
		
		return "login";
	}
	
	@RequestMapping(value = "/loginuser",method = RequestMethod.POST)
	public String LoginPage(@ModelAttribute("user") LoginUser u,HttpSession session,Model m) {
		
	//	System.out.println("Username "+u.getUsername());
	//	System.out.println("Password "+u.getPassword());
		
		boolean status=dao.checkuser(u);
		session.setAttribute("name", u.getUsername());
		if(status) {
			return "redirect:profile";
		}else
		{
			return "invalid";
		}
		
		
	}

}
