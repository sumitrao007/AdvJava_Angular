package com.hefshine.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.bean.Person;

public class TestInsertApp {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		Person p=new Person();
		p.setFirstname("Kiran");
		p.setLastname("Raokhande");
		
		session.save(p);
		session.getTransaction().commit();
		session.close();

	}

}
