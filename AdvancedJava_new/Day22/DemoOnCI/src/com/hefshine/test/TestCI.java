package com.hefshine.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Student;

public class TestCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("springci.xml");
		
		Student s= context.getBean("s", Student.class);
		System.out.println(s);
	}

}
