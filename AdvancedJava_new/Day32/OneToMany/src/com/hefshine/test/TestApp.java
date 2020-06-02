package com.hefshine.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.bean.Account;
import com.hefshine.bean.Employee;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		Account acc1=new Account(2345698 , "Saving");
		Account acc2=new Account(4567896 , "Current");
		
		List<Account> listacc=new ArrayList<Account>();
		listacc.add(acc1);
		listacc.add(acc2);
		
		Employee e=new Employee();
		
		e.setFname("Sumit");
		e.setLname("Raokhande");
		e.setAccount(listacc);
		
		session.save(acc1);
		session.save(acc2);
		session.save(e);
		
		
		session.getTransaction().commit();
		session.close();
		
				

	}

}
