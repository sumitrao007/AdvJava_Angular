package com.hefshine.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		Query qry = session.createQuery("delete Product p where p.id=:myid");
		 qry.setParameter("myid", 2);
		 
		 int res=qry.executeUpdate();
		 System.out.println("record deleted... "+res);
		
		session.getTransaction().commit();
		session.close();

	}

}
