package com.hibernate.onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestPerson {
	public static void main (String...args){
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Person.class);
		config.addAnnotatedClass(PersonDetail.class);
		config.configure();
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		PersonDetail personDetail = new PersonDetail();
		personDetail.setJob("Developer");
		personDetail.setZipCode("54000");
		personDetail.setIncome(250000);
		
		Person person = new Person();
		person.setPersonName("Huzfi");
		
		person.setPersonDetail(personDetail);
		
		session.save(person);
		session.getTransaction().commit();
		
	}
}
