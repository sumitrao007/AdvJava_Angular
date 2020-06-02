package com.hefshine.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
//		Query qry = session.createQuery("update Product p set p.description=:desc where p.id=1");
//				qry.setParameter("desc", "Good Product1!!!!");		 
//				int res=qry.executeUpdate();
		
		
		
//		Query qry = session.createQuery("update Product p set p.description=? where p.id=?");
//		qry.setParameter(0, "Awsome Product2   !!!!");
//		qry.setParameter(1, 2);
		
		Query qry = session.createQuery("update Product p set p.description=:desc where p.id=:id");
		qry.setString("desc","Awsome Product2 worth  !!!!");
		qry.setInteger("id", 2);
	
		
		int res=qry.executeUpdate();
		
		
		session.getTransaction().commit();
		session.close();

	}

}
