package com.hefshine.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Triangle;

public class Testspringcandidateautowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("springcandidateautowire.xml");
		
		Triangle t=context.getBean("triangle",Triangle.class);
		
		System.out.println(t);
		
	}

}
