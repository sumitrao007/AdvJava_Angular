package com.hefshine.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hefshine.bean.Product;

public class AllRecordTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
//		Query query=session.createQuery("from Product p");
////		
//		List<Product> list=query.list();
//		
//		for (Product prod : list) {
//			System.out.println("Id is :: "+prod.getId());
//			System.out.println("Description is :: "+prod.getDescription());
//			System.out.println("Price is :: "+prod.getPrice());
//			System.out.println("Quantity is :: "+prod.getQuantity());
//			System.out.println("--------------------------------------");
//		}
		
//		//Get Particular Record
//				Query query=session.createQuery("from Product where id=:myid");
//				query.setInteger("myid", 3);
//				Product p1=(Product)query.uniqueResult();
//				System.out.println(p1);
		
//HQL to get records with pagination
		
		Query query=session.createQuery("from Product");  
		query.setFirstResult(5);  
		query.setMaxResults(9);  
		List<Product> list=query.list();//will return the records from 1 to 5th number  
		
		for (Product p : list) {
			System.out.println(p);
		}
				
		
		session.getTransaction().commit();
		session.close();

	}

}
