package com.hibernate.chp2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestCustomer {
	
	public static void main(String []args){
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Customer.class);
		config.configure();
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		Customer alex = new Customer();
		alex.setCustomerName("Alex Rod");
		alex.setCustomerAddress("220 Washginton high Town");
		alex.setCreditScore(100);
		alex.setRewardPoints(2000);
		
		session.save(alex);
		session.getTransaction().commit();
	}

}
