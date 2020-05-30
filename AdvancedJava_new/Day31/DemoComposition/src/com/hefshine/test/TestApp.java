package com.hefshine.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.bean.Address;
import com.hefshine.bean.Person;

public class TestApp {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		//Write your code here
		
//		Address address=new Address();
//		address.setCity("Pune");
//		address.setPin("410043");
//		
//		Set<String> hobbies=new HashSet<String>();
//		hobbies.add("Outing");
//		hobbies.add("Watching Movie");
//		hobbies.add("Cooking");
//		
//		Person p=new Person();
//		p.setFname("Kiran");
//		p.setLname("Raokhande");
//		
//		p.setAddress(address);
//		p.setHobbies(hobbies);
//		
//		session.save(p);
		
		Query query=	session.createQuery("from Person");
		
		List<Person> list=query.getResultList();
		
		for (Person person : list) {
			System.out.println(person);
			
		}
		
		session.getTransaction().commit();
		session.close();

	}

}
