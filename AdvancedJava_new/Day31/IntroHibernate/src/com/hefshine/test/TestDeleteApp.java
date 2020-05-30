package com.hefshine.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.bean.Person;

public class TestDeleteApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		Person p= session.load(Person.class, new Integer(2));
		
		session.delete(p);
		session.getTransaction().commit();
		session.close();
		
		

	}

}
