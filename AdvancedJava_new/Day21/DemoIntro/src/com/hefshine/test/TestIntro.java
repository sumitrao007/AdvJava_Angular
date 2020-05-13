package com.hefshine.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Student;

public class TestIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
//			Student s=(Student)context.getBean("student");
			
		Student s=context.getBean("student", Student.class);
			
			s.setRollnumber(101);
			s.setName("Sumit2");
			
			System.out.println(s);
			
		Student s1=context.getBean("student",Student.class);
			
			System.out.println(s1);
		

	}

}
