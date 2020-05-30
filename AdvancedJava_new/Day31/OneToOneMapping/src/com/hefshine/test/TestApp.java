package com.hefshine.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.bean.Account;
import com.hefshine.bean.Address;
import com.hefshine.bean.Employee;

public class TestApp {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		Account account=new Account(45678932, "Current");
		Address address=new Address("Pune", "410043");
		
		Employee e=new Employee();
		e.setFname("kiran");
		e.setLname("Raokhande");
		
		session.save(account);
		e.setAccount(account);
		e.setAddress(address);
		
		session.save(e);
		
		session.getTransaction().commit();
		session.close();
		
	}

}
