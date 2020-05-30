package com.hefshine.test;

import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hefshine.bean.Person;

public class TestAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		session.beginTransaction();
		
		//Get All Record use Criteria
//		Criteria criteria=session.createCriteria(Person.class);
//		
//		List<Person> list=criteria.list();
//		
//		for (Person person : list) {
//			System.out.println(person);
//		}
		
		//Get All Record Using Native Query
		
//		Query query=session.createNativeQuery("select * from person", Person.class);
//		
//		List<Person> list1= query.getResultList();
//		
//		for (Person person : list1) {
//			System.out.println(person);
//		}
		
		
//	javax.persistence.Query query=	session.createQuery("from Person");
//	List<Person> list2=query.getResultList();
//	
//	for (Person person : list2) {
//		System.out.println(person);
//	}

		
	//Get Particular Record
		Person p= session.get(Person.class, new Integer(2));
		System.out.println(p);
		
		
		session.getTransaction().commit();
		session.close();

	}

}
