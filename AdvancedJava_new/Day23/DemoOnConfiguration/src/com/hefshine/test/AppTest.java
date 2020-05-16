package com.hefshine.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hefshine.bean.Employee;
import com.hefshine.config.AppConfig;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee e=context.getBean(Employee.class);
		System.out.println(e);
		
		
	}

}
