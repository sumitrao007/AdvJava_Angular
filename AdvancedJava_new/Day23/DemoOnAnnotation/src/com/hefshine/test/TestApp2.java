package com.hefshine.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Employee1;

public class TestApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee1 e=context.getBean("emp1",Employee1.class);
		System.out.println(e);

	}

}
