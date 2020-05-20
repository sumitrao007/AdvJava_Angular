package com.hefshine.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Student;
import com.hefshine.dao.StudentDAO;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		StudentDAO dao=context.getBean("student_dao",StudentDAO.class);
		
		Student s=context.getBean("student",Student.class);
		s.setRollnumber(10);
		s.setFirstname("Ashok1");
		s.setLastname("Raokhande1");
		
	//	System.out.println("Data Insertated Successfully... "+dao.insertData(s));
		
	//	System.out.println("Data Updatated Successfully... "+dao.updateData(s));
		
//		List<Student> s1= dao.getAllrecord();
//		
//		for (Student student : s1) {
//			System.out.println("Roll Number :: "+student.getRollnumber());
//			System.out.println("First Name :: "+student.getFirstname());
//			System.out.println("Last Name :: "+student.getLastname());
//			System.out.println("--------------------------------------");
//			
//		}
		
		System.out.println("----------------------------");
		Student s2=dao.getParticularData(20);
		System.out.println("Roll Number :: "+s2.getRollnumber());
		System.out.println("First Name :: "+s2.getFirstname());
		System.out.println("Last Name :: "+s2.getLastname());
				

	}

}
