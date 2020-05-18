package com.hefshine.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Account;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Account a=context.getBean("ac",Account.class);
		
		//a.deposits();
		
		a.withdraw();
		
	//	a.deposits1(10000);
		

	}

}
