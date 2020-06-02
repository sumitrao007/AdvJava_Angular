package com.hefshine.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hefshine.bean.Item;

public class TestInsertApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
//		Item i1=new Item(450.50, 2, "Good Product1...");
//		Item i2=new Item(1000, 12, "Good Product2...");
//		Item i3=new Item(100, 20, "Good Product3...");
//		
//		session.save(i1);
//		session.save(i2);
//		session.save(i3);
		
//		String myquery="insert into Product(id,price,description,quantity)"+
//				" select i.id,i.price,i.description,i.quantity from Item i ";
		
		Query query= session.createQuery("insert into Product(price,quantity,description)"
		+"  select i.price,i.quantity,i.description from Item i");
		
		int res=query.executeUpdate();
		
		System.out.println("Data is inserted "+res);
		
		
		
		session.getTransaction().commit();
		session.close();

	}

}
